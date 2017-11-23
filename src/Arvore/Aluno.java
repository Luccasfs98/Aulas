package Arvore;

import java.util.Scanner;

public class Aluno {
    private int matricula;
    private String nome;

    public Aluno(int mat, String nome) {
        this.matricula = mat;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
