package com.demo.api_consecionaria_autos.service;

import com.demo.api_consecionaria_autos.model.Auto;
import com.demo.api_consecionaria_autos.repository.IAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService implements IAutoService{
    @Autowired
    private IAutoRepository autoRepo;

    @Override
    public List<Auto> getAutos() {
        List<Auto> listaAutos = autoRepo.findAll();
        return listaAutos;
    }

    @Override
    public void saveAuto(Auto auto) {
        autoRepo.save(auto);
    }

    @Override
    public void deleteAuto(Long id) {
        autoRepo.deleteById(id);
    }
}
