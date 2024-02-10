package com.example.refuerzoJueves.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "autores")
public class Autor {

    @Id /**/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /// Primera forma
    // Integer autor_id; /// si quiero que vaya con el nombre del campo de la base de datos
    // Segunda forma
    @Column(name = "autor_id") // uso esto si el atributo tiene otro nombre, pero lo referencio con el column
    private Integer id;
    private String nombre;
    private String apellido;
    //// autorres y libros , muchos a muchos
    @ManyToMany
    @JoinTable( /// define cual es la tabla intermedia que une ambas entidades con
            name = "Libros_autores",// nombre de tabla intermedia
            joinColumns = @JoinColumn(name = "autor_id_fk"),/// cual campo en la tablaintermedia que une la entidad autor con la tabla intermedia
            inverseJoinColumns = @JoinColumn(name = "isbn")/// cual campo en la tablaintermedia que une la entidad libro con la tabla intermedia
    )

}
