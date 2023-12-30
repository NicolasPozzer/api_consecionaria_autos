package com.demo.api_consecionaria_autos.service;

import com.demo.api_consecionaria_autos.model.Auto;

import java.util.List;

public interface IAutoService {

    public List<Auto> getAutos();

    public void saveAuto(Auto auto);

    public void deleteAuto(Long id);

}
