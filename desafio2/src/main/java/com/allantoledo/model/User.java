package com.allantoledo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//@author Allan Toledo
@Table(name="usuario") //NÃO É PERMITIDO CRIAR TABELA "USER"
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int id;
    private String name; //CONVENHAMOS, SERIA MELHOR PADRONIZAR TUDO EM INGLÊS OU PORTUGUÊS
    private String password;
    //UUID NÃO IMPLEMENTADO POR CONTA DO COMENTARIO DA PROVA
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
