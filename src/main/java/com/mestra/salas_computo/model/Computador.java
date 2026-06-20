package com.mestra.salas_computo.model;

public class Computador {

    Integer id;
    String especificaciones;
    Integer salaPerteneciente;

    public Computador() {
    }

    public Computador(Integer id, String especificaciones, Integer salaPerteneciente) {
        this.id = id;
        this.especificaciones = especificaciones;
        this.salaPerteneciente = salaPerteneciente;
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

    public Integer getSalaPerteneciente() {
        return salaPerteneciente;
    }

    public void setSalaPerteneciente(Integer salaPerteneciente) {
        this.salaPerteneciente = salaPerteneciente;
    }
}
