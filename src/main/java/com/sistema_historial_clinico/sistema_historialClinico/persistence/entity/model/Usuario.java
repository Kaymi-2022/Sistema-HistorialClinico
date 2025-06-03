package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer idUsuario;

    private String username;

    private String email;

    private String telefono;

    private String numeroColegiado;

    private String especialidad;

    private String fotoPerfil;

    private Boolean activo;

    private Date fechaCreacion;

    @OneToMany(mappedBy = "usuario")
    private List<Cita> citas;

    @OneToMany(mappedBy = "usuario")
    private List<Consulta> consultas;

    @ManyToOne
    @JoinColumn(name="rol_id",insertable = false, updatable = false)
    private Rol rol;

    @OneToMany(mappedBy = "usuario")
    private List<Paciente> pacientes;

}
