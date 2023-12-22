package com.demo.api_consecionaria_autos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
@Inheritance(strategy = InheritanceType.JOINED) //Para hacer la herencia de vehiculo en la DB
public class Auto extends Vehiculo{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_auto;
    private int puertas;

    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, String patente, Double precio, Long id_auto, int puertas) {
        super(id, marca, modelo, patente, precio);
        this.id_auto = id_auto;
        this.puertas = puertas;
    }
}
