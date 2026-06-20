package com.mestra.salas_computo.model;

public class Sala {

    Integer id;
    String nome;
    int capacidad;

    public Sala() {
    }

    public Sala(Integer id, String nome, int capacidad) {
        this.id = id;
        this.nome = nome;
        this.capacidad = capacidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
