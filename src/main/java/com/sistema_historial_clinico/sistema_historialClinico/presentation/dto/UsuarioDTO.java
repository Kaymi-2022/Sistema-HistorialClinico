package com.sistema_historial_clinico.sistema_historialClinico.presentation.dto;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model.Rol;

public class UsuarioDTO {
    private Long id;
    private String user;
    private String name;
    private String lastname;
    private String correo;
    private String phone;
    private String specialty;
    private String numbercollegiate;
    private Rol rol;
}
