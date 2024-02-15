package com.codigo.msregistro.ports.out;

import com.codigo.msregistro.aggregates.dto.PersonaDTO;
import com.codigo.msregistro.aggregates.request.RequestPersona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceOut {

    PersonaDTO crearPersonaOut(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaOut(Long id);
    List<PersonaDTO> obtenerTodosOut();
    PersonaDTO actualizarOut(Long id, RequestPersona requestPersona);
    PersonaDTO deleteOut(Long Id requestPersona); //// corregir aqui

}
