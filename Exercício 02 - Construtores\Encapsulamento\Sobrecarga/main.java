package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(011,"Vinicius Marcos","Nubank",true,1.500,5.000);

        System.out.println("BANCO - " + conta1.getBanco());
        System.out.println("NÚMERO DA CONTA - " + conta1.getNumConta());
        System.out.println("NOME - " + conta1.getNome());
        System.out.println("LIMITE ESPECIAL - R$" + conta1.getLimiteEspecial() + " Reais");
        conta1.depositar(500);
        conta1.realizarSaque(200);
        conta1.saldo();
        conta1.verificarUsoChequeEspecial();
        System.out.println("ESPECIAL - " + conta1.getLimiteEspecial());

    }
}