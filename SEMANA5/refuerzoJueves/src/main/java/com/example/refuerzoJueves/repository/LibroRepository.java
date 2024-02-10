package com.example.refuerzoJueves.repository;

import com.example.refuerzoJueves.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, String> {
}
