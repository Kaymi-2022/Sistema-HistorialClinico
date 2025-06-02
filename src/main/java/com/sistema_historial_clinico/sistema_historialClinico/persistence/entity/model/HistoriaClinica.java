package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name= "historias_clinicas")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="historia_id")
    private Integer idHistoriaClinica;

    private String codigoHistoria;

    private Date fechaApertura;

    private String antecedentesOdontologicos;

    private String habitos;

    private String frecuenciaCepillado;

    private Boolean usoFluor;

    private String notasImportantes;

    @OneToMany(mappedBy = "historiaClinica", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Consulta> consultas;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, orphanRemoval = true)
    private ExamenClinico examenClinico;

    @OneToOne
    @JoinColumn(name = "paciente_id",insertable = false,updatable = false)
    private Paciente paciente;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, orphanRemoval = true)
    private Test test;



}
