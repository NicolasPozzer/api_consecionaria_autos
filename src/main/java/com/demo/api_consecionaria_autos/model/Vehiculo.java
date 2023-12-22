package com.demo.api_consecionaria_autos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehiculo {

    private Long id;
    private String marca;
    private String duenio;
    private String patente;

    public Vehiculo() {
    }

    public Vehiculo(Long id, String marca, String duenio, String patente) {
        this.id = id;
        this.marca = marca;
        this.duenio = duenio;
        this.patente = patente;
    }
}
