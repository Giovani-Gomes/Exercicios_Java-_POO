    package Exercicios.java;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            imprimirTela(Calculadora.somar(7,10));
            imprimirTela(Calculadora.subtrair(7,9));
            imprimirTela(Calculadora.multiplicar(10,10));
            imprimirTela(Calculadora.dividir(10,5));
            imprimirTela(Calculadora.potenciacao(7,8));
        }
        static void imprimirTela(int num){
            System.out.println(num);
        }
    }