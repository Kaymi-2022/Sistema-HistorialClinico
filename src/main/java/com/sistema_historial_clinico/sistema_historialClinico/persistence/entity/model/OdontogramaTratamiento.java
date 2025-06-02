package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "odontograma_tratamientos")
public class OdontogramaTratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "odontograTratamientos_id")
    private Integer idOdontogramaTratamiento;

    private String piezaDental;

    private Date fechaAplicacion;

    private String observacion;

    @ManyToOne
    @JoinColumn(name="odontogramas_id",insertable = false,updatable = false)
    private Odontograma odontograma;

    @ManyToOne
    @JoinColumn(name = "tratamientoDental_id",insertable = false,updatable = false)
    private TratamientoDental tratamientoDental;

}
