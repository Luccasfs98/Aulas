package Orientadas_Aulas.POO_Aula_2_Exercicios;

import java.util.Scanner;

public class Horario {
    Scanner tc = new Scanner(System.in);
    public int hora,min,seg;

    public void setTime(){
        do {
            System.out.print("Hora: ");
            this.hora=tc.nextInt();
            System.out.print("Minutos: ");
            this.min=tc.nextInt();
            System.out.print("Segundos: ");
            this.seg=tc.nextInt();
        }
             while (!this.verifyTime());

    }

    public boolean verifyTime(){
        boolean teste=true;


        if(this.hora>24 || this.hora <= 0){
            teste=false;
        }
        if(this.min>60 || this.min<0){
            teste=false;
        }
        if(this.seg>60 || this.seg<0){
            teste=false;
        }

        if(this.seg==60){
            this.seg=0;
            this.min++;
        }
        if(this.min==60){
            this.min=0;
            this.hora++;
        }
        if(this.hora==24 && this.min == 60){
            this.hora--;
            System.out.println("Horário máx atingido");
        }

        if (teste==false){
            System.out.println("Você precisa digitar valores válidos");
        }
        return teste;
    }

    public void getTime(){
        System.out.println("Horario: "+this.hora+":"+this.min+":"+this.seg);
    }

}

