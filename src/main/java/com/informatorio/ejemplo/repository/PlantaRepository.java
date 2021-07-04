package com.informatorio.ejemplo.repository;

import com.informatorio.ejemplo.entity.Planta;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlantaRepository extends CrudRepository<Planta, Long>{
    /*
        CrudRepository requiere de dos clases, el  primero que clase vamos a hacer CRUD
        y segundo que tipo de dato tiene la clave de la entidad
    */ 

    
}