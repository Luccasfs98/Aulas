package Orientadas_Aulas.POO_Aula_4.Conta_Corrente;

import java.util.Scanner;

public class ContaCorrente {

    private double saldo;
    private String numero;
    private String senha;
    private Cliente titular = new Cliente();
    private  double limite;

    public void mostraSaldo(){
        System.out.println("Saldo"+this.saldo);
    }
    public void criarConta(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o nome do titular: ");
        this.titular.nome = tc.next().toUpperCase();
        System.out.println("Digite o cpf: ");
        this.titular.cpf = tc.next();
        System.out.println("Digite a idade do titular: ");
        this.titular.idade = tc.nextInt();

        if (this.titular.idade>60){
            this.limite =300;
        }   else {
            this.limite= 200;
        }

        System.out.println("Numero da conta: ");
        numero = tc.next();

        System.out.println("Senha: ");
        senha = tc.next();

    }
    public boolean efetuaSaque(double valor){
        if (this.saldo+limite<valor){
            System.out.println("Saldo indisponível");
            return false;
        } else {
            this.saldo -= valor;
        }
    return true;
    }

    public boolean efetuaDeposito(ContaCorrente conta1, double valor){

        if (this.equals(conta1)){
            this.saldo += valor;
            if (this.saldo<valor) {
                return false;
            } else
            return true;
        }
         else {
            this.efetuaSaque(valor);
            conta1.saldo += valor;
        }
        return true;
    }

    public boolean efetuaTransferencia(ContaCorrente conta1, double valor){
        if (this.saldo<valor) {
            return false;
        }
        if (this.equals(conta1)){
            System.out.println("Impossível transferir para a mesma conta");
            return false;
        }
            else {
            this.efetuaSaque(valor);
            this.efetuaDeposito(conta1, valor);
            return true;
        }
    }
}
