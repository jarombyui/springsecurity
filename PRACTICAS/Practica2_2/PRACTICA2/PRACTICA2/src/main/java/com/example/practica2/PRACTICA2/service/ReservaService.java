package com.example.practica2.PRACTICA2.service;

import com.example.practica2.PRACTICA2.model.Reserva;
import com.example.practica2.PRACTICA2.repository.ReservaRepository;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.PrimitiveIterator;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public ResponseBase agregarReserva(Reserva reserva)
    {
        Reserva reservaGuardada = reservaRepository.save(reserva);
        return new ResponseBase(201, "Reserva creada con exito",true,
                Optional.of(reservaGuardada));
    }

}
