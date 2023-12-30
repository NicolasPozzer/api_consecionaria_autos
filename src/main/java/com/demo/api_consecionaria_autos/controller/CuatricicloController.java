package com.demo.api_consecionaria_autos.controller;

import com.demo.api_consecionaria_autos.model.Cuatriciclo;

import com.demo.api_consecionaria_autos.service.CuatricicloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos/cuatriciclos")
public class CuatricicloController {

    @Autowired
    private CuatricicloService cuatriServ;

    @GetMapping("/list")
    public List<Cuatriciclo> getCuatriciclos(){
        return cuatriServ.getCuatriciclos();
    }

    @PostMapping("/crear")
    public String saveCuatricilo(@RequestBody Cuatriciclo cuatri){
        cuatriServ.saveCuatriciclo(cuatri);
        return "CUATRI Cargado!!";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteCuatriciclo(@PathVariable Long id){
        cuatriServ.deleteCuatriciclo(id);
        return "CUATRI Eliminado!";
    }
}
