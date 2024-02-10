package com.example.practica2.PRACTICA2.service;

import com.example.practica2.PRACTICA2.model.Vuelo;
import com.example.practica2.PRACTICA2.repository.VueloRepository;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.Optional;

@Service
public class VueloService {
    @Autowired
    private VueloRepository vueloRepository;

    public ResponseBase agregarVuelo(Vuelo vuelo)
    {
        Vuelo vueloGuardado = vueloRepository.save(vuelo);
        return new ResponseBase(201, "Vuelo creado con exito", true,
                Optional.of(vueloGuardado));
    }

    /*// metodo para guardar un nuevo vuelo
    public Vuelo saveVuelo(Vuelo vuelo)
    {
        return vueloRepository.save(vuelo);
    }*/
}
