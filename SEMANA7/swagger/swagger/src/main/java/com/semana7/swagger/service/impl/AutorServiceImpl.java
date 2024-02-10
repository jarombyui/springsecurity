package com.semana7.swagger.service.impl;

import com.semana7.swagger.entity.AutorEntity;
import com.semana7.swagger.repository.AutorRepository;
import com.semana7.swagger.service.AutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor// podria haber usado el @Autowired o implementar el constructor// pero si tengo una doble implementacion para unainterfaz no podre
public class AutorServiceImpl implements AutorService {
    /// injeccion constructor
    /// injeccion por setter
    /// injeccion por cambio con @Autowired
    /// injeccion por metodo
    /// injeccion por nombre con @Qualifier

    /// si usas la injeccion por constructor no podras
    @Autowired
    private final AutorRepository autorRepository;/// final para ser identificado por mi injeccion de constructor
    @Override
    public AutorEntity crearAutor(AutorEntity autor) {
        return null;
    }

    @Override
    public List<AutorEntity> obtenerTodos() {
        return autorRepository.findAll();
    }

    @Override
    public AutorEntity obtenerUno(Long id) {
        Optional<AutorEntity> autor = autorRepository.findById(id);
        if(autor.isPresent()){
            return autor.get();
        }else {
            return null;
        }

    }

    @Override
    public AutorEntity actualizar(Long id, AutorEntity autor) {
        return null;
    }

    @Override
    public AutorEntity eliminar(Long id) {
        return null;
    }
}
