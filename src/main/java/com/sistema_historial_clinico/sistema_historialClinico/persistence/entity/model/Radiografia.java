package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "radiografia")
public class Radiografia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRadiografia;

    private String rutaImagen;

    private Date fechaTomada;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "paciente_id",insertable = false,updatable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "consulta_id",insertable = false,updatable = false)
    private Consulta consulta;

    @ManyToOne
    @JoinColumn(name = "cita_id",insertable = false,updatable = false)
    private Cita cita;


}
