package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "permisos")
public class Permiso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permiso_id")
    private Integer idPermiso;

    private String codigo;

    private String descripcion;

    @OneToMany(mappedBy = "permiso")
    private List<RolPermiso> rolPermisos;

}
