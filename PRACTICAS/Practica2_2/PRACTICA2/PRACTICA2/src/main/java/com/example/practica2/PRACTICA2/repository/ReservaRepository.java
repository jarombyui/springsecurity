package com.example.practica2.PRACTICA2.repository;

import com.example.practica2.PRACTICA2.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
