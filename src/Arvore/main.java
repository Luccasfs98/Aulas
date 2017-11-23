package Arvore;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      int ope;
      int mat=0;
      int matricula;
      Scanner tc = new Scanner(System.in);
      ArvoreBinaria arvore = new ArvoreBinaria();
      do {
          System.out.println("O que você deseja fazer?\n1-Inserção \n2-Remoção\n3-Listagem\n0-Sair");
          ope = tc.nextInt();

          switch (ope){
              case 1:
                  String nome;
                  System.out.println("Digite o nome do aluno: ");
                  nome = tc.next();
                  System.out.println("Numero matricula: ");
                  mat = tc.nextInt();
                  arvore.insereAluno(mat,nome);
                  break;
              case 2:
                  System.out.println("Digite uma matricula para remoção: ");
                  matricula = tc.nextInt();
                  arvore.remover(arvore,arvore.busca(matricula));
                  break;

              case 3:
                  int op;
                  System.out.println("Listar: ");
                  System.out.println("1-Em-Ordem");
                  System.out.println("2-Pré-Ordem");
                  System.out.println("3-Pós-Ordem");
                  op = tc.nextInt();

                  if (op==1){
                      arvore.percorrerEmOrdem();
                      break;
                  }
                  if (op==2){
                      arvore.percorrerPreOrdem();
                      break;
                  }
                  if (op==3){
                      arvore.percorrerPosOrdem();
                      break;
                  }
                  else {
                      System.out.println("Algo deu errado...");
                      break;
                  }
          }

      } while (ope!=0);
    }

}
