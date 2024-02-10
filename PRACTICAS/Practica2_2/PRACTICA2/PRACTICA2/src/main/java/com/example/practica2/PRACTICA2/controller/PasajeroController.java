package com.example.practica2.PRACTICA2.controller;

import com.example.practica2.PRACTICA2.model.Pasajero;
import com.example.practica2.PRACTICA2.repository.PasajeroRepository;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import com.example.practica2.PRACTICA2.service.PasajeroService;
import org.aspectj.weaver.ResolvedPointcutDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pasajero")
public class PasajeroController {
    @Autowired
    private PasajeroService pasajeroService;

    @PostMapping("/save")
    public ResponseBase createPasajero(@RequestBody Pasajero pasajero)
    {
        return pasajeroService.agregarPasajero(pasajero);
    }

}
