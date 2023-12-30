package com.demo.api_consecionaria_autos.controller;

import com.demo.api_consecionaria_autos.model.Auto;
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


}
