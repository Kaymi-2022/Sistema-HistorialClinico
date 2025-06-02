package com.sistema_historial_clinico.sistema_historialClinico.persistence.entity.enums;

public enum Afirmacion {
    SI("Si"),
    NO("No");

    private final String value;

    Afirmacion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
