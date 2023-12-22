package com.demo.api_consecionaria_autos.service;

import org.springframework.stereotype.Service;

@Service
public class AutoService implements IVehiculoService{
    @Override
    public String velocidadMaxima() {
        String velocidad = "La velocidad Maxima es 320km";
        return velocidad;
    }
}
