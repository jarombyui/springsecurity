package com.example.refuerzoJueves.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "editoriales")
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "editorial_id")// esto sirve para indicar a cual campo nos referimos, ya que se uso un nombre un pocodistinto
    private Integer id;
    private String nombre;
    private String pais;
    @OneToMany(mappedBy = "editorial") // mappetBy se usa para ientificar
    private List<Libro> Libros;

}
