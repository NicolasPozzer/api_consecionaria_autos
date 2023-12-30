package com.demo.api_consecionaria_autos.service;

import com.demo.api_consecionaria_autos.model.Moto;
import com.demo.api_consecionaria_autos.model.Vehiculo;
import com.demo.api_consecionaria_autos.repository.IMotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService implements IMotoService{
    @Autowired
    private IMotoRepository repoMoto;

    @Override
    public List<Moto> getMotos() {
        List<Moto> listaMotos = repoMoto.findAll();
        return listaMotos;
    }

    @Override
    public void saveMoto(Moto moto) {
        repoMoto.save(moto);
    }

    @Override
    public void deleteMoto(Long id) {
        repoMoto.deleteById(id);
    }
}
