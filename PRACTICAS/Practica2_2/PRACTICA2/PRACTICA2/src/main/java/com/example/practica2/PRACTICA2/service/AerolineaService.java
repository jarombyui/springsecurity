package com.example.practica2.PRACTICA2.service;


import com.example.practica2.PRACTICA2.model.Aerolinea;
import com.example.practica2.PRACTICA2.repository.AerolineaRepository;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.AbstractQueue;
import java.util.Optional;

@Service
public class AerolineaService {

    @Autowired
    private AerolineaRepository aerolineaRepository;

    //
    public ResponseBase agregarAerolinea(Aerolinea aerolinea)
    {
        Aerolinea aerolineaGuardada = aerolineaRepository.save(aerolinea);
        return  new ResponseBase(201,"Aeroliena seleccionada con exito",true,
                Optional.of(aerolineaGuardada));
    }

}
