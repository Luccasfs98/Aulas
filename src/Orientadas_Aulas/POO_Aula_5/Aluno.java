package Orientadas_Aulas.POO_Aula_5;

import java.util.Scanner;

public class Aluno {
    Scanner tc = new Scanner(System.in);

    private int codigoAluno;
    private String nomeAluno;
    private String telefone;

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno=codigoAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
