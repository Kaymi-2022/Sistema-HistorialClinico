package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "odontograma")
public class Odontograma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "odontogramas_id")
    private Integer idOdontograma;

    private Date fechaCreacion;

    private String observacion;

    private String fotoOdontograma;

    @OneToOne
    @JoinColumn(name = "consulta_id",insertable = false,updatable = false)
    private Consulta consulta;

    @OneToMany(mappedBy = "odontograma")
    private List<OdontogramaTratamiento> odontogramaTratamientos;
}
