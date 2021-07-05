package com.informatorio.ejemplo.entity;
import com.informatorio.ejemplo.entity.Persona;


import java.util.Calendar;
import java.util.Objects;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="jornada_id")
public class Jornada extends Persona{


        @Column(name = "monto_por_hora", nullable = false, scale = 2)
        private double monto_por_hora;

    /**
     * @return double return the monto_por_hora
     */
    public double getMonto_por_hora() {
        return monto_por_hora;
    }

    /**
     * @param monto_por_hora the monto_por_hora to set
     */
    public void setMonto_por_hora(double monto_por_hora) {
        this.monto_por_hora = monto_por_hora;
    }

}