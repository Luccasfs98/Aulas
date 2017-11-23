/*
package Orientadas_Aulas.POO_Aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int op,cont=0,contTurma=0;
        ArrayList<Aluno>alunos = new ArrayList<Aluno>();
        ArrayList<Turma>turmas = new ArrayList<Turma>();
        do {
            System.out.println("O que você deseja fazer? \n 1-Cadastrar Aluno \n 2-Matricular Aluno \n 3-Cadastrar Curso\n4-Cadastrar Turma");
            op = tc.nextInt();

            switch (op){
                case 1:
                    cont++;
                    Aluno aluno = new Aluno();
                    String nome,telefone;
                    aluno.setCodigoAluno(cont);
                    System.out.println("Digite o nome do aluno: ");
                    nome = tc.next();
                    System.out.println("Digite o telefone: ");
                    telefone = tc.next();
                    aluno.setTelefone(telefone);
                    System.out.println("Aluno cadastrado");
                    alunos.add(aluno);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:

                    Turma turma = new Turma();
                    String nomeTurma;
                    contTurma++;
                    System.out.println("Digite nome da turma:");
                    nomeTurma = tc.next();
                    turma.setNome(nomeTurma);
                    turma.setCodTurma(contTurma);
                    turmas.add(turma);

            }
        }   while (op!=0);


    }
}
*/