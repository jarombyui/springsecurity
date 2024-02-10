package com.example.practica2.PRACTICA2.repository;

import com.example.practica2.PRACTICA2.model.Piloto;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Integer> {
}
