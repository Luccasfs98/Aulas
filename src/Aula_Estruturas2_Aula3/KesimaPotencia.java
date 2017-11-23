package Aula_Estruturas2_Aula3;

public class KesimaPotencia {
    public int contKesima = -1;
    public int calculaKP(int x){
        System.out.println("Status do Valor: "+x);
        contKesima++;
        if (x==0)
            return 1;
        else return (2*calculaKP(x-1));
    }
}
