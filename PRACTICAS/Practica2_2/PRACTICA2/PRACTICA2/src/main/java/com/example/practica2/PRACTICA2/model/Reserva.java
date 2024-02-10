package com.example.practica2.PRACTICA2.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reserva")

public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reserva_id")
    private Integer id;
    @Column(name = "asiento_numero")
    private String asientoNumero;
    private String estado;

    // relacion de reserva a vuelo, muchos-uno

    @ManyToOne
    @JoinColumn(name = "vuelo_id_fk")
    private Vuelo vuelo;

    // relacion de reserva a pasajero

    @ManyToOne
    @JoinColumn(name = "pasajeo_id_fk")
    private Pasajero pasajero;


}
