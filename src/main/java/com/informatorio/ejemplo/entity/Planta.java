package com.informatorio.ejemplo.entity;
import com.informatorio.ejemplo.entity.Persona;
<<<<<<< HEAD

import java.util.Calendar;
import java.util.Objects;
import javax.persistence.*;
@Entity
@PrimaryKeyJoinColumn(name="planta_id")
public class Planta extends Persona{

    @Column(name = "fecha_inic", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fecha_inic; //Luego será Date

    @Column(name = "puesto", nullable = false, length = 150)
    private String puesto;

    @Column(name = "monto_por_mes", nullable = false, scale = 2)
    private double monto_por_mes; //Luego será BigDecimal


    public void setFecha_Inic(Calendar fecha_inic){
        this.fecha_inic = fecha_inic;
    }

    public Calendar getFecha_Inic(){
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="PersonaId")
public class Planta extends Persona{

    private String fecha_inic; //Luego será Date
    private String puesto;
    private String monto; //Luego será BigDecimal


    public void setFecha_Inic(String fecha){
        this.fecha_inic = fecha;
    }

    public String getFecha_Inic(){
>>>>>>> 8a1e0ab4b66d64916a2bab07b78a100a5960ed15
        return fecha_inic;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public String getPuesto(){
        return puesto;
    }

<<<<<<< HEAD
    public void setMonto(double monto_por_mes){
        this.monto_por_mes = monto_por_mes;
    }

    public double getMonto(){
        return monto_por_mes;
=======
    public void setMonto(String monto){
        this.monto = monto;
    }

    public String getMonto(){
        return monto;
>>>>>>> 8a1e0ab4b66d64916a2bab07b78a100a5960ed15
    }

}

