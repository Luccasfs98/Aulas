package Aula_Estruturas2_Aula3;

public class Ackermann {
    public int contAc=-1;

    public int calculaAcker(int x,int y){
        contAc++;
        System.out.println("Status n1:"+x+ "  n2: "+y);
      if(x==0) {
          return y + 1;
      }
      if(y==0) {
          return calculaAcker(x - 1, 1);
      }
       else {
          return calculaAcker(x - 1, calculaAcker(x, (y - 1)));
      }
    }
}
