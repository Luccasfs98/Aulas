package Aula_Estruturas2_Aula3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        int ope;
        int n1;

        do {
            System.out.println("Qual operação você deseja fazer?\n1-Fatorial\n2-Fibonacci\n3-Ackermann\n4-Késima Potência\n5-Késimo Par\n0-Sair ");
            ope = tc.nextInt();
            System.out.println("Digite o numero que deseja calcular: ");
            n1 = tc.nextInt();

            switch (ope){

                case 1:
                    Fatorial fat = new Fatorial();
                    System.out.println("O Fatorial deste número é: "+fat.calculaFat(n1)+" Recursividades: "+fat.contFat);
                    break;

                case 2:
                    Fibonacci fib = new Fibonacci();
                    System.out.println("O Fibonacci deste número é: "+fib.calcFib(n1)+" Recursividades: "+fib.contFib);
                    break;

                case 3:
                    int n2=0;
                    System.out.println("Digite mais um valor inteiro: ");
                    n2 = tc.nextInt();
                    Ackermann acker = new Ackermann();
                    System.out.println("O Ackermann deste número é: "+acker.calculaAcker(n1,n2)+" Recursividades:"+acker.contAc);
                    break;

                case 4:
                    KesimaPotencia kesimap = new KesimaPotencia();
                    System.out.println("Kesima Potencia: "+kesimap.calculaKP(n1)+" Recursividades: "+kesimap.contKesima);
                    break;

                case 5:
                    KesimoPar kesimop = new KesimoPar();
                    System.out.println("Kesimo Par:"+kesimop.calcKPa(n1)+" Recursividades: "+kesimop.contKesimo);
                    break;
            }

        } while (ope!=0);


    }


}
