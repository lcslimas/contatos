package com.example.fivecontacts.main.model;

import java.io.Serializable;
// Modelo de contato com getters e setters
public class Contato implements Serializable, Comparable {
    String nome;
    String numero;

    @Override
    public int compareTo(Object o) {
        Contato c2= (Contato)o;
        return this.getNome().compareTo(c2.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
