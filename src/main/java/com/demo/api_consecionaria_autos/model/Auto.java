package com.demo.api_consecionaria_autos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Auto extends Vehiculo{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_auto;
    private int puertas;

    public Auto() {

    }

    public Auto(Long id, String marca, String duenio, String patente, Long id_auto, int puertas) {
        super(id, marca, duenio, patente);
        this.id_auto = id_auto;
        this.puertas = puertas;
    }
}
