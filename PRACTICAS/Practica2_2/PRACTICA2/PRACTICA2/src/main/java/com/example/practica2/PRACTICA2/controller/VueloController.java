package com.example.practica2.PRACTICA2.controller;

import com.example.practica2.PRACTICA2.model.Vuelo;
import com.example.practica2.PRACTICA2.response.ResponseBase;
import com.example.practica2.PRACTICA2.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vuelo")
public class VueloController {
    @Autowired
    private VueloService vueloService;
    @PostMapping("/create")
    public ResponseBase crearVuelo(Vuelo vuelo)
    {
        return vueloService.agregarVuelo(vuelo);
    }


}
