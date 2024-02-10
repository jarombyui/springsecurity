package com.example.practica2.PRACTICA2.service;

import com.example.practica2.PRACTICA2.model.Pasajero;
import com.example.practica2.PRACTICA2.model.Reserva;
import com.example.practica2.PRACTICA2.repository.PasajeroRepository;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PasajeroService {
    @Autowired
    private PasajeroRepository pasajeroRepository;

    public ResponseBase agregarPasajero(Pasajero pasajero)
    {
        Pasajero pasajeroGuardado = pasajeroRepository.save(pasajero);
        return new ResponseBase(201, "Pasajero creado con exito",true,
                Optional.of(pasajeroGuardado));
    }

    /*// metod para guardar pasajero
    public Pasajero savePasajero(Pasajero pasajero)
    {
        return pasajeroRepository.save(pasajero);

    }*/
}
