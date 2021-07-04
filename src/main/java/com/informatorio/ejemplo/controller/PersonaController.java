package com.informatorio.ejemplo.controller;
import com.informatorio.ejemplo.entity.Persona;
import com.informatorio.ejemplo.repository.EmpleadoRepository;

import java.util.Iterator;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;



@RestController //Es RestController poque ya viene configurada para Jason
public class PersonaController{
    //Todo controller tiene una router, una ruta, por defecto es en la homa con "/"

    //Hacemos una inyeccion de la interfaz para este controller
    @Autowired
    private EmpleadoRepository repository;


    @GetMapping(value = "/empleados")
    public @ResponseBody Iterable<Persona> findEmpleados(){
        //Aqui debo hacer refencia a la interfaz guardada en repository

        
        return repository.findAll();


    }
    // @ResponseBody Intenta mapearlo de collecion java a jason array


}