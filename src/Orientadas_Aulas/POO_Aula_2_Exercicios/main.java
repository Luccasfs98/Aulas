package Orientadas_Aulas.POO_Aula_2_Exercicios;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int ope=0;

        do {
            Horario ex3 = new Horario();
            System.out.println("Deseja digitar um horário?\n1-Sim\n2-Nao");
            ope = tc.nextInt();
            ex3.setTime();
            ex3.getTime();
        } while(ope!=2);

    }
}
