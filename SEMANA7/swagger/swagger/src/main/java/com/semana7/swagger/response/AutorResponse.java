package com.semana7.swagger.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorResponse {
    private Long idAutor;

    private String tipoDoc;
    private String numDoc;
    private String nombres;
    private String apellidos;
    private String email;
    private String estado;
    private String userCreate;
    private String dateCreate;
    private String userModif;
    private String dateModif;
    private String userDelete;
    private String dateDelete;
}
