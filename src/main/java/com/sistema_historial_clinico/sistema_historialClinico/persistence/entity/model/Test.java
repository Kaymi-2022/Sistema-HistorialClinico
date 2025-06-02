package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums.Afirmacion;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "evaluacion_microorganismos")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="evaluacion_id")
    private Integer idEvaluacionMicroorganismo;

    private Afirmacion pruebaComida;

    private Afirmacion enfriaAlimento;

    private Afirmacion comparteUtensilios;

    private Afirmacion besaBocaMano;

    private String observaciones;

    private Date fechaEvaluacion;

    @OneToOne
    @JoinColumn(name = "historia_id", updatable = false, insertable = false)
    private HistoriaClinica historiaClinica;


}
