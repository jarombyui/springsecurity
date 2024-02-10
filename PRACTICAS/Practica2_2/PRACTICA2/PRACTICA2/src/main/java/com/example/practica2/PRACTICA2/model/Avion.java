package com.example.practica2.PRACTICA2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "avion")
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avion_id")
    private Integer id;
    private String modelo;
    @Column(name = "capacidad_pasajeros")
    private int capacidadPasajeros;
    private String estado;


    // relacion avion aerolineas muchos-una
    @ManyToOne
    @JoinColumn(name = "aerolinea_id_fk")
    private Aerolinea aerolinea;

}
