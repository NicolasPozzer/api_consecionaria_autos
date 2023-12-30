package com.demo.api_consecionaria_autos.controller;

import com.demo.api_consecionaria_autos.model.Moto;
import com.demo.api_consecionaria_autos.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos/motos")
public class MotoController {

    @Autowired
    private MotoService motoServ;

    @GetMapping("/list")
    public List<Moto> getMotos(){
        return motoServ.getMotos();
    }

    @PostMapping("/crear")
    public String saveMoto(@RequestBody Moto moto){
        motoServ.saveMoto(moto);
        return "Moto Cargada!!";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteMoto(@PathVariable Long id){
        motoServ.deleteMoto(id);
        return "Moto Eliminada!";
    }
}
