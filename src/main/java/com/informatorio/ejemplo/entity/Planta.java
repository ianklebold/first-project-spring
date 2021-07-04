package com.informatorio.ejemplo.entity;
import com.informatorio.ejemplo.entity.Persona;
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
        return fecha_inic;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public String getPuesto(){
        return puesto;
    }

    public void setMonto(String monto){
        this.monto = monto;
    }

    public String getMonto(){
        return monto;
    }

}

