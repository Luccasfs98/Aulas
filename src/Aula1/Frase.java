package Aula1;

import java.util.Scanner;
/*
 * Faça um método que receba uma String, verifica se ela é vazia, se for vazia retorna -1.
  * Caso contrário retorna o número de consoantes e caracteres especiais que contêm na String.
   * Você pode criar mais de um método para resolver essa questão. Faça uma classe para testar o método.
 */
public class Frase {
    Scanner tc = new Scanner(System.in);
    public String frase;
    public int contaConsoantes=0;

    public void lerFrase(){
        System.out.println("Digite uma frase:");
        this.frase= tc.next();
        this.frase.toLowerCase();
    }

    public int testaFrase(){
        System.out.println("contando consoantes");
        if (this.frase.isEmpty()==true){
            System.out.println("ao9");
            return -1;
        }   else {
            for (int i = 0; i < this.frase.length(); i++) {
                if (this.frase.charAt(i) != 'a' && this.frase.charAt(i) != 'e' && this.frase.charAt(i) != 'i' && this.frase.charAt(i) != 'o' && this.frase.charAt(i) != 'u') {
                    this.contaConsoantes++;
                }

            }
            return this.contaConsoantes;
        }

        }


}
