package com.informatorio.ejemplo.entity;
import com.informatorio.ejemplo.entity.Persona;


import java.util.Calendar;
import java.util.Objects;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="contratado_id")
public class Contratado extends Persona{

        @Column(name = "especialidad", nullable = false, length = 150)
        private String especialidad;

        @Column(name = "fecha_venc", updatable = false, nullable = false)
        @Temporal(TemporalType.DATE)
        private Calendar fecha_venc;

        @Column(name = "monto_mensual", nullable = false, scale = 2)
        private double monto_mensual;

        /**
         * @return String return the especialidad
         */
        public String getEspecialidad() {
            return especialidad;
        }

        /**
         * @param especialidad the especialidad to set
         */
        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        /**
         * @return Calendar return the fecha_venc
         */
        public Calendar getFecha_venc() {
            return fecha_venc;
        }

        /**
         * @param fecha_venc the fecha_venc to set
         */
        public void setFecha_venc(Calendar fecha_venc) {
            this.fecha_venc = fecha_venc;
        }

        /**
         * @return double return the monto_mensual
         */
        public double getMonto_mensual() {
            return monto_mensual;
        }

        /**
         * @param monto_mensual the monto_mensual to set
         */
        public void setMonto_mensual(double monto_mensual) {
            this.monto_mensual = monto_mensual;
        }

}