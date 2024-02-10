package com.example.practica2.PRACTICA2.repository;

import com.example.practica2.PRACTICA2.model.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, Integer> {
}
