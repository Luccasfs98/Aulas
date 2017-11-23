package Aula_Estruturas2_Aula3;

public class Fibonacci {
    public int contFib=-1;
    public int calcFib(int x){
        System.out.println("Status do Valor: "+x);
        contFib++;
        if (x<2){
            return 1;
        } else
            return calcFib(x-1)+ calcFib(x-2);
    }
}
