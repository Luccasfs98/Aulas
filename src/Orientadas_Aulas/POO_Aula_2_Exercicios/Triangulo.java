package Orientadas_Aulas.POO_Aula_2_Exercicios;

import java.util.Scanner;

public class Triangulo {
    Scanner tc = new Scanner(System.in);
    public double base;
    public double altura;


    public void getData(){
        System.out.println("Digite o valor da base: ");
        this.base = tc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        this.altura = tc.nextDouble();
    }

    public void getTriangulo(){
        System.out.println("Altura do Triangulo: "+this.altura);
        System.out.println("Base do Triangulo: "+this.base);
    }

    public double calculaArea(){
        double area = 0;

        area = (this.altura*this.base)/2;

        return area;
    }
}

