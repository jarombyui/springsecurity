package com.semana7.swagger.service;

import com.semana7.swagger.entity.AutorEntity;

import java.util.List;

public interface AutorService {
    AutorEntity crearAutor(AutorEntity autor); /// si usamos esta forma si funciona pero no es recomendable,
    // porque queda expuesto a que interactue con el controlador,y que se pueda ingresar a tu tabla por ende atus datos
    List<AutorEntity> obtenerTodos();
    AutorEntity obtenerUno(Long id);
    AutorEntity actualizar(Long id, AutorEntity autor);
    AutorEntity eliminar(Long id);


}
