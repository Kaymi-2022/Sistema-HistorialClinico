package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums;

public enum TipoDocumento {
    DNI("Documento Nacional de Identidad"),
    CE("Carnet de Extranjería"),
    PASAPORTE("Pasaporte"),
    OTRO("Otro tipo de documento");

    private final String descripcion;

    TipoDocumento(String descripcion) {
        this.descripcion = descripcion;
    }
}
