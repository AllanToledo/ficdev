package com.allantoledo.controller;

import com.allantoledo.model.AlunoModel;
import com.allantoledo.view.AlunoView;

public class AlunoController {

    private AlunoModel aluno;
    private AlunoView alunoVisao;

    public AlunoController(AlunoModel aluno, AlunoView alunoVisao) {
        this.aluno = aluno;
        this.alunoVisao = alunoVisao;
    }

    public void atualizaDadosAluno(String nome, int idade, String matricula) {
        aluno.setNome(nome);
        aluno.setIdade(idade);
        aluno.setMatricula(matricula);
        exibirDetalhesAluno();
    }

    public void exibirDetalhesAluno() {
        String nome = aluno.getNome();
        int idade = aluno.getIdade();
        String matricula = aluno.getMatricula();
        alunoVisao.exibirDadosAluno(nome, idade, matricula);
    }
}
