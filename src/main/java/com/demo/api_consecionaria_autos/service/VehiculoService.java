package com.demo.api_consecionaria_autos.service;

import com.demo.api_consecionaria_autos.model.Auto;
import com.demo.api_consecionaria_autos.model.Cuatriciclo;
import com.demo.api_consecionaria_autos.model.Moto;
import com.demo.api_consecionaria_autos.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class VehiculoService implements IVehiculoService{

    @Autowired
    private AutoService autoServ;
    @Autowired
    private MotoService motoServ;
    @Autowired
    private CuatricicloService cuatriServ;


    @Override
    public List<Vehiculo> listaVehiculos() {
        List<Auto> listaAutos = autoServ.getAutos();
        List<Moto> listaMotos = motoServ.getMotos();
        List<Cuatriciclo> listaCuatris = cuatriServ.getCuatriciclos();

        List<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.addAll(listaAutos);
        listaVehiculos.addAll(listaMotos);
        listaVehiculos.addAll(listaCuatris);

        return listaVehiculos;
    }

    @Override
    public Double inversionTotal() {
        Double acumDinero=0.0;

        List<Vehiculo> listaVehiculos = listaVehiculos();

        for (Vehiculo vehi : listaVehiculos){
            acumDinero = acumDinero + vehi.getPrecio();
        }

        return acumDinero;
    }

    @Override
    public void aumentarPrecioVehiculos(Double porcentaje){
        for (Auto auto : autoServ.getAutos()){
            Double nuevoPrecio;
            nuevoPrecio = auto.getPrecio() + auto.getPrecio() * porcentaje / 100;
            auto.setPrecio(nuevoPrecio);
            /*Guardar cambios*/
            this.autoServ.saveAuto(auto);
            System.out.println(auto.getPrecio());
        }
        for (Moto moto : motoServ.getMotos()){
            Double nuevoPrecio;
            nuevoPrecio = moto.getPrecio() + moto.getPrecio() * porcentaje / 100;
            moto.setPrecio(nuevoPrecio);
            /*Guardar cambios*/
            this.motoServ.saveMoto(moto);
        }
        for (Cuatriciclo cuatri : cuatriServ.getCuatriciclos()){
            Double nuevoPrecio;
            nuevoPrecio = cuatri.getPrecio() + cuatri.getPrecio() * porcentaje / 100;
            cuatri.setPrecio(nuevoPrecio);
            /*Guardar cambios*/
            this.cuatriServ.saveCuatriciclo(cuatri);
        }
    }

    @Override
    public List<Vehiculo> listaVehiculosMenoresA(Double precio) {
        List<Vehiculo> listaVehiculosMenores = new ArrayList<>();

        for (Vehiculo vehiculo : listaVehiculos()){
            if (vehiculo.getPrecio() <= precio){
                listaVehiculosMenores.add(vehiculo);
            }
        }
        return listaVehiculosMenores;
    }
}
