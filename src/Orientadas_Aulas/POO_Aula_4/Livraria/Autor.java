package Orientadas_Aulas.POO_Aula_4.Livraria;
import java.util.Scanner;
public class Autor {

    public String nome;
    public String email;


    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o nome do Autor");
        this.nome=tc.next();///
        System.out.println("Digite o email");
        this.email=tc.next();///


    }
    public void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.email);

    }
}
