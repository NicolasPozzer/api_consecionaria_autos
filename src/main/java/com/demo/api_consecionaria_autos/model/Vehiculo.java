package com.demo.api_consecionaria_autos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehiculo {

    private Long id;
    private String tipo;
    private String marca;
    private String modelo;
    private String patente;
    private Double precio;

    public Vehiculo() {
    }

    public Vehiculo(Long id, String tipo, String marca, String modelo, String patente, Double precio) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.precio = precio;
    }
}
