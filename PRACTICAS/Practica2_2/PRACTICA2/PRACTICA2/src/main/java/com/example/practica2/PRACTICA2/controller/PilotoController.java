package com.example.practica2.PRACTICA2.controller;

import com.example.practica2.PRACTICA2.model.Piloto;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import com.example.practica2.PRACTICA2.service.PilotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/piloto")
public class PilotoController {
    @Autowired
    private PilotoService pilotoService;
    @PostMapping("/save")
    public ResponseBase createPiloto(@RequestBody Piloto piloto)
    {
        return pilotoService.agregarPiloto(piloto);
    }

}
