package com.mongodb_tutoria.service;

import com.mongodb_tutoria.model.Tarea;
import com.mongodb_tutoria.repository.TareaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service // '@Service' es una de las anotaciones de Spring Framework que se utiliza para marcar una clase como
// un servicio dentro de la capa de negocio de una aplicación
public class TareaService {
    @Autowired // nos exime de crear constructor
    private TareaRepositorio tareaRepositorio; /// este atributo se crea primero luego el @Autowired

    // aquí podemos crear los metodos como: agregarTarea
    public Tarea guardarTarea(Tarea tarea ){ /// dentro del los () va los que se recive, atributo y tipo de atributo almacenadoen la varible 'tarea'
        tarea.setTareaId(UUID.randomUUID().toString().split("-")[0]);// 'tarea.setTareaId' con esto se actualizará el valor del id
    // 'UUID.randomUUID()' generar un identificador único universal (UUID)
    // '.toString()'
    // 'split("-")[0]' nos permite limitar una cadena, en este ejemplo separado con '-', y se tomara el primer bloque de digitos de 4 o 5 digitos
        return tareaRepositorio.save(tarea);//.'save(tarea)' almacenara una entidad 'tarea', si ya existe la actualizara, si no lo almacenara como un nuevo documento
    }
    ///'findAll' como obtendriamos todas las tareas que hemos generado?
    // seria con un array = List<Tipo?> = List<Tarea>
    public List<Tarea> obtenerListadoDeTareas(){
        return tareaRepositorio.findAll();
    }
    // Eliminar Delete - aqui no se necesita retornar nada por ello usamo el void/String, no retorna valores en public por ello se cambio a String
    public String eliminarTarea(String tareaId){
        /* return tareaRpositorio.deleteById();  */// el delete retorna un String que viene de tareaId, se borro el return
        tareaRepositorio.deleteById(tareaId);
        // si quisieramos que muestre un mensaje si se elimina correctamente
        return tareaId+"La tarea se ha eliminado correctamente";
    }

    public Tarea actualizarTarea(Tarea tarea){
        // forma 1 /*Tarea tarea1 = tareaRepositorio.findById(tarea.getTareaId())*/; //arroja un error, tarea1 deveria ser del tipo optional
        ///por que el metodo findId es del tipo optional, puede que lo encuentre o puede que no lo encuentre
        // forma 2 /*Optional<Tarea> tarea1 = tareaRepositorio.findById(tarea.getTareaId());*/
        // forma 3

        Tarea tarea1 = tareaRepositorio.findById(tarea.getTareaId()).get();/* el get permite acceder al optional*/// con esto indicamos que estamos seguros de que encontraremos un valor
        //
        tarea1.setDescripcion(tarea1.getDescripcion());
        tarea1.setImportancia(tarea1.getImportancia());
        tarea1.setAsignado(tarea1.getAsignado());
        tarea1.setNota(tarea1.getNota());

        return tareaRepositorio.save(tarea1);
}


}
