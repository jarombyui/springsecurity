package com.example.practica2.PRACTICA2.controller;

import com.example.practica2.PRACTICA2.model.Reserva;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import com.example.practica2.PRACTICA2.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reserva")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @PostMapping("/save")
    public ResponseBase createReserva(@RequestBody Reserva reserva)
    {
        return reservaService.agregarReserva(reserva);
    }

}
