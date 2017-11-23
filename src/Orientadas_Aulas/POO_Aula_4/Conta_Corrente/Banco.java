package Orientadas_Aulas.POO_Aula_4.Conta_Corrente;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        ArrayList <ContaCorrente> banco  = new ArrayList<ContaCorrente>();
        int op=0;

        ContaCorrente luccas = new ContaCorrente();
        luccas.criarConta();
        luccas.mostraSaldo();

        ContaCorrente alo = new ContaCorrente();
        alo.criarConta();
        alo.efetuaDeposito(alo,1000);
        alo.mostraSaldo();
        alo.efetuaTransferencia(luccas, 500);
        System.out.println("Luccas");
        luccas.mostraSaldo();

        System.out.println("Alo");
        alo.mostraSaldo();
        banco.add(alo);
        banco.add(luccas);





    }
}
