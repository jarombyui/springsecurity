package com.example.practica2.PRACTICA2.controller;

import com.example.practica2.PRACTICA2.model.Aerolinea;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import com.example.practica2.PRACTICA2.service.AerolineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/aerolinea")
public class AerolineaController {
    @Autowired
    private AerolineaService aerolineaService;

    @PostMapping("/save")
    public ResponseBase createAerolinea(@RequestBody Aerolinea aerolinea)
    {
        return aerolineaService.agregarAerolinea(aerolinea);
    }

}
