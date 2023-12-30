package com.demo.api_consecionaria_autos.controller;

import com.demo.api_consecionaria_autos.model.Auto;
import com.demo.api_consecionaria_autos.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos/autos")
public class AutoController {

    @Autowired
    private AutoService autoServ;

    @GetMapping("/list")
    public List<Auto> getAutos(){
        return autoServ.getAutos();
    }

    @PostMapping("/crear")
    public String saveAuto(@RequestBody Auto auto){
        autoServ.saveAuto(auto);
        return "Auto Cargado!";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteAuto(@PathVariable Long id){
        autoServ.deleteAuto(id);
        return "Auto Eliminado Correctamente!";
    }
}
