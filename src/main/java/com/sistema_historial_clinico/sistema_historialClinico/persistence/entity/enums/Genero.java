package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums;

public enum Genero {
    M("MASCULINO"),
    F("FEMENINO");

    private final String descripcion;

    Genero(String descripcion) {
        this.descripcion = descripcion;
    }

}
