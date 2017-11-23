package Aula_Estruturas2_Aula3;

public class Fatorial {
    public int contFat=-1;

    public int calculaFat(int x){
        System.out.println("Status do Valor: "+x);
        contFat++;
        if (x==0){
            return 1;
        } else
            return(x*calculaFat(x-1));
    }
}
