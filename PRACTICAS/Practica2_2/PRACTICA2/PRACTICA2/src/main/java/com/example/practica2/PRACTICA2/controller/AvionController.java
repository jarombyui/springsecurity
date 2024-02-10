package com.example.practica2.PRACTICA2.controller;

import com.example.practica2.PRACTICA2.model.Aerolinea;
import com.example.practica2.PRACTICA2.model.Avion;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import com.example.practica2.PRACTICA2.service.AerolineaService;
import com.example.practica2.PRACTICA2.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/avion")
public class AvionController {
    @Autowired
    private AvionService avionService;

    @PostMapping("/save")
    public ResponseBase createAvion(@RequestBody Avion avion)
    {
        return avionService.agregarAvion(avion);
    }

}
