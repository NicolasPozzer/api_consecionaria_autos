package com.demo.api_consecionaria_autos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Cuatriciclo extends Vehiculo{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_cuatriciclo;
    private String cilindrada;

    public Cuatriciclo() {
    }

    public Cuatriciclo(Long id, String marca, String modelo, String patente, Double precio, Long id_cuatriciclo, String cilindrada) {
        super(id, marca, modelo, patente, precio);
        this.id_cuatriciclo = id_cuatriciclo;
        this.cilindrada = cilindrada;
    }
}
