package com.example.refuerzoJueves.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "libros")
public class Libros {
    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/ // esto no va ya que nosotros lo generamos
    private String isbn;
    private String titulo;
    @Column(name = "anio_publicacion")// usamos esto para especificar a que campo nos referimos, ya que tiene un nombre un poco distinto
    private int anioPublicacion;
    private float precio;

    /// relacion libros a editorial
    @ManyToOne /// libros a editorial
    @JoinColumn(name = "editorial_id_fk") // porque las tablas se unen por este  campo que es el FK (Foreign Key)
    private Editorial editorial; /// JPA te obliga que tengas un objeto, entidad para usar las anotaciones, por eso no se usa el nombre de la FK como tal

    //// de libro hacia autores muchos a muchps falta completar
    /*@ManyToMany(mappedBy = "libros")*/// como puedo identificar un libro en la tabla de autores

    /// relacion libros con comentarios - partiendo de libro hacia comentario
    @OneToMany
    @JoinColumn(name = "libro_isbn_fk") // cual campo une libro con comentarios
    List<Comentario> comentarios; /// porque un libro puede tener multiples comentarios

    /// relacion libros con categorias


}
