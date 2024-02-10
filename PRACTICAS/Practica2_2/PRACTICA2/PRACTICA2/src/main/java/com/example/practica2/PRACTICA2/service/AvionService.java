package com.example.practica2.PRACTICA2.service;

import com.example.practica2.PRACTICA2.model.Avion;
import com.example.practica2.PRACTICA2.model.Reserva;
import com.example.practica2.PRACTICA2.repository.AvionRepository;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvionService {

    @Autowired
    private AvionRepository avionRepository;

    public ResponseBase agregarAvion(Avion avion)
    {
        Avion avionGuardado = avionRepository.save(avion);
        return new ResponseBase(201, "Avion creada con exito",true,
                Optional.of(avionGuardado));
    }


    /*/// metodo para guardar un nuevo avion
    public Avion saveAvion(Avion avion)
    {
        return avionRepository.save(avion);
    }*/

}
