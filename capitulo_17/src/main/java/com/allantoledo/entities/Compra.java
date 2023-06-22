package com.allantoledo.entities;

//@author Allan Toledo

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    @ManyToOne
    @JoinColumn(name="produto_id")
    Produto produto;
    @ManyToOne
    @JoinColumn(name="cliente_id")
    Cliente cliente;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}

