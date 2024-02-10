package com.example.practica2.PRACTICA2.service;

import com.example.practica2.PRACTICA2.model.Pasajero;
import com.example.practica2.PRACTICA2.model.Piloto;
import com.example.practica2.PRACTICA2.repository.PilotoRepository;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PilotoService {
    @Autowired
    private PilotoRepository pilotoRepository;

    public ResponseBase agregarPiloto(Piloto piloto)
    {
        Piloto pilotoGuardado = pilotoRepository.save(piloto);
        return new ResponseBase(201, "Piloto creado con exito",true,
                Optional.of(pilotoGuardado));
    }

    ///
    /*public Piloto savePiloto(Piloto piloto)
    {
        return pilotoRepository.save(piloto);
    }*/

}
