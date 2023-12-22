package com.demo.api_consecionaria_autos.controller;

import com.demo.api_consecionaria_autos.model.Auto;
import com.demo.api_consecionaria_autos.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehiculoController {

    @Autowired
    private AutoService autoServ;

    @GetMapping("/vehiculos/autos/list")
    public List<Auto> getAutos(){
        return autoServ.getAutos();
    }

    @PostMapping("/vehiculos/autos/crear")
    public String saveAuto(@RequestBody Auto auto){
        autoServ.saveAuto(auto);
        return "Auto Cargado!";
    }

}
