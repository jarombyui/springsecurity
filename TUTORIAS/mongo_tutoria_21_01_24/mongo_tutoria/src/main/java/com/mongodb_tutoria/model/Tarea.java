package com.mongodb_tutoria.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tareas") ///MONGO nos trae @Document, esto nos permite mapearla como una coleccion
@AllArgsConstructor @NoArgsConstructor @Data ///'@AllArgsConstructor' nos permite crear un constructor pasandole todos los parametros
//// '@NoArgsConstructor', permite crear un constructor pero sin pasarle ARGUMENTOS o valores (vacio?)
/// '@Data', permite crear los getters y setters de la clase y un par de metodos mas
public class Tarea {
    private String tareaId;
    private String descripcion;
    private int importancia;
    private String asignado;
    private int nota;

}
