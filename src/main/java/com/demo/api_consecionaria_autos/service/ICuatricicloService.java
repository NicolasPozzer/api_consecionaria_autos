package com.demo.api_consecionaria_autos.service;

import com.demo.api_consecionaria_autos.model.Cuatriciclo;

import java.util.List;

public interface ICuatricicloService {

    public List<Cuatriciclo> getCuatriciclos();

    public void saveCuatriciclo(Cuatriciclo cuatriciclo);

    public void deleteCuatriciclo(Long id);
}
