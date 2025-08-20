package com.example.API.MODELO.MIERCOLES.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
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


    @OneToOne
    //3. en la tabla que tiene la fk configuro la relacion con la otra tabla
    @JoinColumn(name = "fk_usuario",referencedColumnName = "id")
    @JsonManagedReference(value = "relacionentreusuarioyestudiante")
    private Usuario usuario;

    //CREANDO RELACION DE UNO A MUCHOS
    //1. PARA REPRESENTAR MUCHOS ELEMENTOS DE  OTRA TABLA DEBO CREAR UN ARREGLOS (LISTA)

    @OneToMany(mappedBy = "estudiante")
    @JsonBackReference(value = "relacionentreestudianteyasistencia")
    private ArrayList<Asistencia> asistencias;

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
