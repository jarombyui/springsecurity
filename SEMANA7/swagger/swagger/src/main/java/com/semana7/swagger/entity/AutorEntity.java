package com.semana7.swagger.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "autor")
public class AutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutor;
    @Column(name = "")
    private String tipoDoc;
    private String numDoc;
    private String nombres;
    private String apellidos;
    private String email;
    private String estado;
    private String userCreate;
    private String dateCreate;
    private String userModif;
    private String dateModif;
    private String userDelete;
    private String dateDelete;

/*
 tipo_doc CHAR(2) NOT NULL,
  num_doc VARCHAR(11) NOT NULL,
  nombres VARCHAR(100) NOT NULL,
  apellidos VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  estado INT NOT NULL;
  user_create VARCHAR(45),
  date_create TIMESTAMP,
  user_modif VARCHAR(45),
  date_modif TIMESTAMP,
  user_delete VARCHAR(45),
  date_delete TIMESTAMP
);
* */



}
