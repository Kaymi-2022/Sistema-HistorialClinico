package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tratamientos_dentales")
public class TratamientoDental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tratamientoDental_id")
    private Integer idTratamientoDental;

    private String codigo;

    private String descripcion;

    @OneToMany(mappedBy="tratamientoDental")
    private List<OdontogramaTratamiento> odontogramaTratamientos;

}
