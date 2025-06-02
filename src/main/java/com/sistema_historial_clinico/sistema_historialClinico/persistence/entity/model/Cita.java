package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "citas")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cita_id")
    private Integer idCita;

    private Date fechaInicio;

    private Date fechaTermino;

    private String tipo;

    private String motivo;

    private Boolean asistencia;

    @ManyToOne
    @JoinColumn(name = "usuario_id",insertable = false,updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "paciente_id", insertable = false,updatable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "consulta_id", insertable = false, updatable = false)
    private Consulta consulta;

    @OneToMany(mappedBy = "cita")
    private List<Radiografia> radiografias;
}
