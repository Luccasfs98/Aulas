package Aula1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int num=0,op=0;
        do{
            Frase frase = new Frase();
            System.out.println("O que você deseja fazer?\n1- Testar Frase\n2- Sair");
            op = tc.nextInt();
            if (op==1){

                frase.lerFrase();
                num=frase.testaFrase();
                System.out.println(num);
            }

        } while(op!=2);





    }

}
