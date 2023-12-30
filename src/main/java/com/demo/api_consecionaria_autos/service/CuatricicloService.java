package com.demo.api_consecionaria_autos.service;

import com.demo.api_consecionaria_autos.model.Cuatriciclo;
import com.demo.api_consecionaria_autos.repository.ICuatricicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuatricicloService implements ICuatricicloService{

    @Autowired
    private ICuatricicloRepository repoCuatri;

    @Override
    public List<Cuatriciclo> getCuatriciclos() {
        List<Cuatriciclo> listaCuatriciclos = repoCuatri.findAll();
        return listaCuatriciclos;
    }

    @Override
    public void saveCuatriciclo(Cuatriciclo cuatriciclo) {
        repoCuatri.save(cuatriciclo);
    }

    @Override
    public void deleteCuatriciclo(Long id) {
        repoCuatri.deleteById(id);
    }
}
