package com.demo.api_consecionaria_autos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Moto extends Vehiculo{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_moto;
    private int asientos;

    public Moto() {
    }

    public Moto(Long id, String tipo, String marca, String modelo, String patente, Double precio, Long id_moto, int asientos) {
        super(id, tipo, marca, modelo, patente, precio);
        this.id_moto = id_moto;
        this.asientos = asientos;
    }
}
