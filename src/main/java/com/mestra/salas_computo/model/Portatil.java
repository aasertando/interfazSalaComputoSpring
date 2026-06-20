package com.mestra.salas_computo.model;

public class Portatil {

    Integer id;
    String especificaciones;
    boolean disponible;

    public Portatil() {
    }

    public Portatil(Integer id, String especificaciones, boolean disponible) {
        this.id = id;
        this.especificaciones = especificaciones;
        this.disponible = disponible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
