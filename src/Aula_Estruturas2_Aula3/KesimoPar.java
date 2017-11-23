package Aula_Estruturas2_Aula3;

public class KesimoPar {
    public int contKesimo=-1;
    public int calcKPa(int x){
        System.out.println("Status do Valor: "+x);
        contKesimo++;
        if (x==1) return 0;

        else return (calcKPa(x-1)+2);
    }
}
