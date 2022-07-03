package Exercicios.java;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      ContaCorrente conta1 = new ContaCorrente();
      conta1.banco = "Nubank";
      conta1.numConta = 145;
      conta1.nome = "Vinicius Pereira";
      conta1.especial = true;
      conta1.limiteEspecial = 3.569;
      conta1.saldo = 8.254;

      System.out.println("BANCO - " + conta1.banco);
      System.out.println("NÚMERO DA CONTA - " + conta1.numConta);
      System.out.println("NOME - " + conta1.nome);
      System.out.println("ESPECIAL - " + conta1.especial);
      System.out.println("LIMITE ESPECIAL - R$" + conta1.limiteEspecial + " Reais");
      System.out.println("SALDO - R$" + conta1.saldo + " Reais");




    }
}