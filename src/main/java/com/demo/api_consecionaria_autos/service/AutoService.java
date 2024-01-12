package com.demo.api_consecionaria_autos.service;

import com.demo.api_consecionaria_autos.model.Auto;
import com.demo.api_consecionaria_autos.repository.IAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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
        Optional<Auto> optionalAuto = autoRepo.findById(id);

        if (optionalAuto.isPresent()) {
            autoRepo.deleteById(id);
        } else {
            throw new NoSuchElementException("ID de auto no encontrada");
        }
    }

}
