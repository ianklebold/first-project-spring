package com.informatorio.ejemplo.repository;

import com.informatorio.ejemplo.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Con esto vamos a poder hacer los CRUD de una clase creada en entity a la BD puesta en 
// resources/application.properties
@Repository
public interface EmpleadoRepository extends CrudRepository<Persona, Long>{
    /*
        CrudRepository requiere de dos clases, el  primero que clase vamos a hacer CRUD
        y segundo que tipo de dato tiene la clave de la entidad
    */ 

    
}