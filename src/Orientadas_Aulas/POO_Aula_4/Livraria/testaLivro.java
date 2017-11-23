package Orientadas_Aulas.POO_Aula_4.Livraria;

public class testaLivro {

    public static void main(String[] args) {
        Livro livro1 = new Livro();

        Livro livro2 = new Livro();

        livro1.ler();
        System.out.println(livro1.equals(livro2));
        livro2.ler();



        System.out.println(livro1.nome);
        System.out.println(livro1.descricao);
        System.out.println(livro1.isbn);
        System.out.println(livro1.valor);

        livro1.mostrar();
        livro1.aplicarDescontoDe(0.1);
        livro1.mostrar();
        livro2.mostrar();



    }
}
