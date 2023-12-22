package com.demo.api_consecionaria_autos.service;

import com.demo.api_consecionaria_autos.model.Vehiculo;
import com.demo.api_consecionaria_autos.repository.IMotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoService implements IVehiculoService{



    @Override
    public String velocidadMaxima() {
        String velocidad = "La velocidad Maxima es 180km";
        return velocidad;
    }
}
