package com.informatorio.ejemplo.entity;
import com.informatorio.ejemplo.entity.Persona;

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
        return fecha_inic;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public String getPuesto(){
        return puesto;
    }

    public void setMonto(double monto_por_mes){
        this.monto_por_mes = monto_por_mes;
    }

    public double getMonto(){
        return monto_por_mes;
    }

}

