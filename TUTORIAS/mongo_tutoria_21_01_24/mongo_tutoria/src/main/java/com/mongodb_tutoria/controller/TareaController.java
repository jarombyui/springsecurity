package com.mongodb_tutoria.controller;


import com.mongodb_tutoria.model.Tarea;
/*import com.mongodb_tutoria.service.TareaService;*/
import com.mongodb_tutoria.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/tareas") // con esto se le indica la ruta por donde vamos a acceder


public class TareaController {
    @Autowired // nos permite tener los contructores generados
    private TareaService tareaService;

    @PostMapping// nos pemite iniciar la dependencia de TareaService
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea agregarTarea(@RequestBody Tarea tarea){
        return tareaService.guardarTarea(tarea);

    }
}
