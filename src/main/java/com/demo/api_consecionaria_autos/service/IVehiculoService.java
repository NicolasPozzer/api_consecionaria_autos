package com.demo.api_consecionaria_autos.service;


import com.demo.api_consecionaria_autos.model.Auto;
import com.demo.api_consecionaria_autos.model.Vehiculo;

import java.util.List;

public interface IVehiculoService {

    public List<Vehiculo> listaVehiculos();

    public Double inversionTotal();

    public void aumentarPrecioVehiculos(Double porcentaje);

    public List<Vehiculo> listaVehiculosMenoresA(Double precio);

}
