package com.mongodb_tutoria.repository;

import com.mongodb_tutoria.model.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;

///Como queremos traer las funciones del repositorio de mongo usamos el  MongoRepository
/// se 'extiende'= extends MongoRepository porque esta es una interfaz que provee mongo
///MongoRepository trae de forma automatizada una serie de metodos
// Ademas nos pedira le pasemos como argumento el nombre de la clase = Tarea y su tipo de dato = String
/// nuestro tipo de dato de tareaId es 'String'
public interface TareaRepositorio extends MongoRepository <Tarea, String> {
}
