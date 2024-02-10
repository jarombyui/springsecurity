package com.example.practica2.PRACTICA2.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "vuelo")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vuelo_id")
    private Integer id;
    @Column(name = "fecha_salida")
    private Date fechaSalida;
    @Column(name = "fecha_llegada")
    private Date fechaLlegada;
    private String estado;

    // relacion de vuelo a avion, muchos-uno

    @ManyToOne
    @JoinColumn(name = "avion_id_fk")
    private Avion avion;




}
