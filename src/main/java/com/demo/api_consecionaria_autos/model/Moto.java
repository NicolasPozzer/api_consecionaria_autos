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
public class Moto extends Vehiculo{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_moto;
    private int asientos;

    public Moto(Long id, String marca, String duenio, String patente) {
        super(id, marca, duenio, patente);
    }

    public Moto(Long id, String marca, String duenio, String patente, Long id_moto, int asientos) {
        super(id, marca, duenio, patente);
        this.id_moto = id_moto;
        this.asientos = asientos;
    }
}
