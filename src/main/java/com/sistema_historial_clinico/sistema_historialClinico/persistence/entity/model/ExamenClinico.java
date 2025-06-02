package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums.Nivel;
import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums.TipoLabio;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "examenes_clinicos")
public class ExamenClinico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "examen_id")
    private Integer idExamenClinico;

    private String labios;

    private String carrillos;

    private String frenillos;

    private Nivel labialInsercion;

    private TipoLabio tipoLabio;

    private String alteraciones;

    private String anomaliasTejidoDuro;

    private String relacionIntermaxilar;

    private String observaciones;

    private Date fechaExamen;

    @OneToOne
    @JoinColumn(name = "historia_id", insertable = false,updatable = false)
    private HistoriaClinica historiaClinica;
}
