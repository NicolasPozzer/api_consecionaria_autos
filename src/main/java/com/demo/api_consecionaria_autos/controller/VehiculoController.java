package com.demo.api_consecionaria_autos.controller;

import com.demo.api_consecionaria_autos.model.Auto;
import com.demo.api_consecionaria_autos.model.Vehiculo;
import com.demo.api_consecionaria_autos.service.AutoService;
import com.demo.api_consecionaria_autos.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoServ;

    @GetMapping("/list")
    public List<Vehiculo> listaVehiculos(){
        return vehiculoServ.listaVehiculos();
    }

    @GetMapping("/total")
    public Double inversionTotal(){
        return vehiculoServ.inversionTotal();
    }

    @PostMapping("/aumentar/{porcentaje}")
    public String aumentarPrecioVehiculos(@PathVariable Double porcentaje){
        vehiculoServ.aumentarPrecioVehiculos(porcentaje);
        return "Porcentaje aumentado: "+porcentaje;
    }

    @GetMapping("/menores/{precio}")
    public List<Vehiculo> getMenores(@PathVariable Double precio){
        return vehiculoServ.listaVehiculosMenoresA(precio);
    }

}
