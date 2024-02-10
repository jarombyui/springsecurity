package com.semana7.swagger.repository;

import com.semana7.swagger.entity.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/*@Repository*/ // no es necesario cuando tenemos Jpa, pero si creo mis propios repositorios ahi si lo coloco
public interface AutorRepository extends JpaRepository<AutorEntity, Long> {
}
