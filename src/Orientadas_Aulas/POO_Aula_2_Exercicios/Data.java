package Orientadas_Aulas.POO_Aula_2_Exercicios;

import java.util.Scanner;

public class Data {
    Scanner tc = new Scanner(System.in);
    public int dia,mes,ano;

    public void getDia(){
        System.out.println("Digite o dia do mês: ");
        this.dia = tc.nextInt();
        while(this.dia>31 && this.dia<=0) {
            System.out.println("Mes inválido: ");
            this.dia = tc.nextInt();
        }
            while(this.mes==2 && this.dia > 28){
                System.out.println("Fevereiro é um mês que possui somente 28 dias");
                System.out.println("Digite o dia novamente: ");
                this.dia = tc.nextInt();

            }


    }
     public void getMes(){
        while(this.mes>12 || this.mes<=0) {
            System.out.println("Digite qual o mês ");
            this.mes = tc.nextInt();
        }
    }

      public void getAno(){
            System.out.println("Digite qual o ano ");
            this.ano = tc.nextInt();

    }


}
