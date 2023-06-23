package com.allantoledo.model;

//@author Allan Toledo

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EstoqueDiario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int id;
    private String data;
    private int qtdeitens;
    @ManyToOne
    @JoinColumn(name="entregador_fk")
    private Entregador entregador;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQtdeitens() {
        return qtdeitens;
    }

    public void setQtdeitens(int qtdeitens) {
        this.qtdeitens = qtdeitens;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    
}
