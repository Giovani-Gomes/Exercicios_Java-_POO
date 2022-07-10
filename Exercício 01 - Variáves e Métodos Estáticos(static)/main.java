package Exercicios.java;

import java.util.Scanner;

public class Main {
        static void imprimirValor(){
            System.out.println(Contador.obterValor());
        }

        public static void main(String[] args) {

            imprimirValor();

            Contador.incrementar();

            imprimirValor();

            Contador.zerarContador();

            imprimirValor();

            Contador.incrementar();
            Contador.incrementar();
            Contador.incrementar();

            imprimirValor();

            Contador contador1 = new Contador();
            Contador contador2 = new Contador();
            Contador contador3 = new Contador();

            imprimirValor();
    }
}