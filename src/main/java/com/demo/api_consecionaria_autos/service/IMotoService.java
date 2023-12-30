package com.demo.api_consecionaria_autos.service;

import com.demo.api_consecionaria_autos.model.Moto;

import java.util.List;

public interface IMotoService {

    public List<Moto> getMotos();

    public void saveMoto(Moto moto);

    public void deleteMoto(Long id);
}
