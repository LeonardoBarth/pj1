package com.mensal1.model;

public abstract class Cliente {

    protected String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public abstract double calcularDesconto(double valor);
}