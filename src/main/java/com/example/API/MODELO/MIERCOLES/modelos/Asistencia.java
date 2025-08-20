package com.example.API.MODELO.MIERCOLES.modelos;

import com.example.API.MODELO.MIERCOLES.ayudas.Estado;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
@Entity
@Table(name = "asistencias")

public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha",nullable = false,unique = false)
    private LocalDate fecha;

    @Column(name = "observaciones",nullable =true,unique = false)
    private  String observaciones;

    @Column(name = "estado",nullable = false,unique = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;


    public  Asistencia(){

    }

    public Asistencia(Integer id, LocalDate fecha, String observaciones, Estado estado) {
        this.id = id;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
