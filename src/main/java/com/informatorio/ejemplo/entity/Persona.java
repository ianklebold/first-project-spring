package com.informatorio.ejemplo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String fechaNac;
/*
    public Persona(String nombre, String apellido, String fechaNac){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechaNac(fechaNac);


    }
*/

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    public void setFechaNac(String fechaNac){
        this.fechaNac = fechaNac;
    }

    public String getFechaNac(){
        return fechaNac;
    }


    
}