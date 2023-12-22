package com.demo.api_consecionaria_autos.controller;

import com.demo.api_consecionaria_autos.service.AutoService;
import com.demo.api_consecionaria_autos.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "")
@RestController
public class VehiculoController {

    @Autowired
    private AutoService autoServ;
    @Autowired
    private MotoService motoServ;

    @GetMapping("/vehiculo/moto/velocidadmax")
    public String velocidadMax(){
        return motoServ.velocidadMaxima();
    }

    @GetMapping("/vehiculo/auto/velocidadmax")
    public String velocidadMaxx(){
        return autoServ.velocidadMaxima();
    }


}
