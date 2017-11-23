package Arvore;

public class ArvoreBinaria {

    private No raiz;
    private ArvoreBinaria arvoreEsquerda;
    private ArvoreBinaria arvoreDireita;

    public ArvoreBinaria() {
    }

    public ArvoreBinaria getArvoreDireita() {
        return arvoreDireita;
    }

    public void setArvoreDireita(ArvoreBinaria arvoreDireita) {
        this.arvoreDireita = arvoreDireita;
    }

    public ArvoreBinaria getArvoreEsquerda() {
        return arvoreEsquerda;
    }

    public void setArvoreEsquerda(ArvoreBinaria arvoreEsquerda) {
        this.arvoreEsquerda = arvoreEsquerda;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }


    public void insereAluno(int matricula, String nome) {
        Aluno aluno = new Aluno(matricula,nome);
        No no = new No(aluno);
        inserir(no);
    }

    public void inserir(No no) {
        if (this.raiz == null) {
            this.raiz = no;
        } else {
            if (no.getAluno().getMatricula() > this.raiz.getAluno().getMatricula()) {
                if (this.arvoreDireita == null) {
                    this.arvoreDireita = new ArvoreBinaria();
                }
                this.arvoreDireita.inserir(no);
            } else if (no.getAluno().getMatricula() < this.raiz.getAluno().getMatricula()) {
                if (this.arvoreEsquerda == null) {
                    this.arvoreEsquerda = new ArvoreBinaria();
                }
                this.arvoreEsquerda.inserir(no);
            }
        }
    }

    public void percorrerEmOrdem() {
        if (this.raiz == null) {
            return;
        }

        if (this.arvoreEsquerda != null) {
            this.arvoreEsquerda.percorrerEmOrdem();
        }

        System.out.println("Matrícula: " + this.raiz.getAluno().getMatricula());
        System.out.println("Nome: " + this.raiz.getAluno().getNome());

        if (this.arvoreDireita != null) {
            this.arvoreDireita.percorrerEmOrdem();
        }
    }

    public void percorrerPreOrdem() {
        if (this.raiz == null) {
            return;
        }

        System.out.println("Matrícula: " + this.raiz.getAluno().getMatricula());
        System.out.println("Nome: " + this.raiz.getAluno().getNome());

        if (this.arvoreEsquerda != null) {
            this.arvoreEsquerda.percorrerPreOrdem();
        }

        if (this.arvoreDireita != null) {
            this.arvoreDireita.percorrerPreOrdem();
        }
    }

    public void percorrerPosOrdem() {
        if (this.raiz == null) {
            return;
        }

        if (this.arvoreEsquerda != null) {
            this.arvoreEsquerda.percorrerPosOrdem();
        }

        if (this.arvoreDireita != null) {
            this.arvoreDireita.percorrerPosOrdem();
        }

        System.out.println("Matrícula: " + this.raiz.getAluno().getMatricula());
        System.out.println("Nome: " + this.raiz.getAluno().getNome());
    }
    public ArvoreBinaria maiorDireita(ArvoreBinaria arvore){
        if (arvore.arvoreDireita!=null){
            return maiorDireita(arvore.arvoreDireita.arvoreDireita);
        } else {
            ArvoreBinaria aux = arvore;
            if (arvore.arvoreEsquerda != null){
                arvore = arvore.arvoreEsquerda;
            }
            else {
                arvore = null;
            }
               return aux;
        }
    }

    public ArvoreBinaria menorEsquerda(ArvoreBinaria arvore){
        if(arvore.arvoreEsquerda!= null){
            return menorEsquerda(arvore.arvoreEsquerda.arvoreEsquerda);
        }   else {
            ArvoreBinaria aux = arvore;
            if (arvore.arvoreDireita != null){
                arvore = arvore.arvoreDireita;
            }
            else {
                arvore = null;
            }
            return aux;
            }
    }

    public void remover (ArvoreBinaria arvore, Aluno aluno){
        if (arvore.raiz==null){
            System.out.println("Numero não existe!!");
        }
        if (aluno.getMatricula() < arvore.raiz.getAluno().getMatricula()){
            remover(arvore.arvoreEsquerda,aluno);
            System.out.println(arvore.getRaiz().getAluno().getNome()+"removido1");
        }   else {
                if (aluno.getMatricula() > arvore.raiz.getAluno().getMatricula()){
                    remover(arvore.arvoreDireita, aluno);
                } else {
                    ArvoreBinaria aux = arvore;
                    if ( arvore.arvoreEsquerda==null && arvore.arvoreDireita==null && aluno.getMatricula() == arvore.raiz.getAluno().getMatricula()){
                        System.out.println(arvore.getRaiz().getAluno().getNome()+" removido2");
                        arvore.raiz = null;

                    }   else {
                        if (arvore.arvoreEsquerda == null){
                            arvore = arvore.arvoreDireita;
                            aux.arvoreDireita = null;
                            aux = null;
                            System.out.println(arvore.getRaiz().getAluno().getNome()+"removido3");

                        } else {
                            if (arvore.arvoreDireita == null){
                                arvore = arvore.arvoreEsquerda;
                                aux.arvoreEsquerda = null;
                                aux = null;
                                System.out.println(arvore.getRaiz().getAluno().getNome()+"removido4");

                            } else {
                                aux = maiorDireita(arvore.arvoreEsquerda);
                                aux.arvoreEsquerda = arvore.arvoreEsquerda;
                                aux.arvoreDireita = arvore.arvoreDireita;
                                arvore.arvoreEsquerda = arvore.arvoreDireita = null;
                                arvore = aux;
                                aux= null;
                                System.out.println(this.getRaiz().getAluno().getNome()+ "removido5");

                            }
                        }
                }

            }
        }
    }




    public Aluno busca(int matricula) {
        if (this.raiz == null) {
            return null;
        } else {
            if (matricula == this.raiz.getAluno().getMatricula()) {
                return this.raiz.getAluno();
            } else {
                if (matricula > this.raiz.getAluno().getMatricula()) {
                    if (this.arvoreDireita == null) {
                        return null;
                    }
                    return this.arvoreDireita.busca(matricula);
                } else {
                    if (this.arvoreEsquerda == null) {
                        return null;
                    }
                    return this.arvoreEsquerda.busca(matricula);
                }
            }
        }


    }


}