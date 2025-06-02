package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles_permisos")
public class RolPermiso {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "rol_permiso_id")
    private Integer idRolPermiso;

    @ManyToOne
    @JoinColumn(name = "rol_id", insertable = false, updatable = false)
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "permiso_id",insertable = false, updatable = false)
    private Permiso permiso;

}
