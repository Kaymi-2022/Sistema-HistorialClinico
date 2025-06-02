package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums;

public enum EstadoTratamiento {

    PE("PENDIENTE"),
    CO("COMPLETADA"),
    CA("CANCELADA");

    private final String descripcion;

    EstadoTratamiento(String descripcion){
        this.descripcion=descripcion;
    }
}
