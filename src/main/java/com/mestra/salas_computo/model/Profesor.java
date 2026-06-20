package com.mestra.salas_computo.model;

public class Profesor {

    Integer id;
    String nombre;
    String contraseña;
    boolean activo;
    String carrera;
    int horaInicio;
    int horaFin;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, String contraseña, boolean activo, String carrera, int horaInicio, int horaFin) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.activo = activo;
        this.carrera = carrera;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
}
