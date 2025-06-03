package com.sistema_historial_clinico.sistema_historialClinico.presentation.dto;

import com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.model.Rol;
import lombok.Data;



public class UsuarioDTO {
    private Integer id;
    private String usuario;
    private String nombre;
    private String apellidos;
    private String correo;
    private String phone;
    private String specialty;
    private String numbercollegiate;
    private String nombreRol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getNumbercollegiate() {
        return numbercollegiate;
    }

    public void setNumbercollegiate(String numbercollegiate) {
        this.numbercollegiate = numbercollegiate;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}
