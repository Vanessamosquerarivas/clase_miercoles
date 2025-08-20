package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "promedio",nullable = false,unique = false)
    private Double promedio;

    @Column(name = "fechaN",nullable = false,unique = false)
    private LocalDate fechaNcacimiento;


    public  Estudiante (){
    }

    public Estudiante(Integer id, Double promedio, LocalDate fechaNcacimiento) {
        this.id = id;
        this.promedio = promedio;
        this.fechaNcacimiento = fechaNcacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public LocalDate getFechaNcacimiento() {
        return fechaNcacimiento;
    }

    public void setFechaNcacimiento(LocalDate fechaNcacimiento) {
        this.fechaNcacimiento = fechaNcacimiento;
    }
}
