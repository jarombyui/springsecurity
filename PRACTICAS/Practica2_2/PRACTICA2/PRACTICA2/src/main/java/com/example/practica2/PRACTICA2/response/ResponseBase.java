package com.example.practica2.PRACTICA2.response;

import jdk.jfr.StackTrace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class ResponseBase {
    private int codigo;
    private String mensaje;
    private boolean exito;
    private Optional data;

}
