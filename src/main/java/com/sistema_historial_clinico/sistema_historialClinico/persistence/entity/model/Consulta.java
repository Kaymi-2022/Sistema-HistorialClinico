package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums.EstadoTratamiento;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consulta_id")
    private Integer idConsulta;

    private Date fechaConsulta;

    private String motivoConsulta;

    private String sintomatologia;

    private String examenExtraoral;

    private String examenIntraoral;

    private String diagnostico;

    private String planTratamiento;

    private String observaciones;

    private Date citaProxima;

    private EstadoTratamiento estadoTratamiento;

    @OneToMany(mappedBy = "consulta")
    private List<Cita> citas;

    @ManyToOne
    @JoinColumn(name="historia_id",insertable = false,updatable = false)
    private HistoriaClinica historiaClinica;

    @ManyToOne
    @JoinColumn(name = "usuario_id",insertable = false,updatable = false)
    private Usuario usuario;

    @OneToOne(mappedBy = "consulta")
    private Odontograma odontograma;

    @OneToMany(mappedBy = "consulta")
    private List<Radiografia> radiografias;
}
