package com.demo.api_consecionaria_autos.controller;

import com.demo.api_consecionaria_autos.model.Auto;
import com.demo.api_consecionaria_autos.service.AutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/vehiculos/autos")
public class AutoController {

    @Autowired
    private AutoService autoServ;

    @Operation(summary = "Mostrar listado de Autos.")
    @GetMapping("/list")
    public List<Auto> getAutos(){
        return autoServ.getAutos();
    }

    @Operation(summary = "Crear un Nuevo Auto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Auto |Creado| Correctamente!",
                    content = {
                            @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = Auto.class))
                    }),
            @ApiResponse(responseCode = "500",description = "Error de Parametros invalidos",
                    content = @Content),
            @ApiResponse(responseCode = "400",description = "Error de Response",
                    content = @Content)
    })
    @PostMapping("/crear")
    public String saveAuto(@RequestBody Auto auto){
        autoServ.saveAuto(auto);
        return "Auto Cargado!";
    }

    @Operation(summary = "Borrar un Auto por ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Auto Eliminado Correctamente",
                    content = {
                            @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = Auto.class))
                    }),
            @ApiResponse(responseCode = "500", description = "Error al eliminar el Auto",
                    content = @Content),
            @ApiResponse(responseCode = "400", description = "Error de Response",
                    content = @Content)
    })
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteAuto(@Parameter(description = "ID del auto a borrar", example = "22") @PathVariable Long id) {
        try {
            autoServ.deleteAuto(id);
            return ResponseEntity.ok("Auto eliminado correctamente");
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("ID de auto no encontrada");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar el auto");
        }
    }

}
