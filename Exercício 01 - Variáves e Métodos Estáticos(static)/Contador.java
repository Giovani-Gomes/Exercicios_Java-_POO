package Exercicios.java;

public class Contador {
    private static int cont;

    public Contador() {
        cont++;
    }

    public static void incrementar(){
        cont++;
    }

    public static void zerarContador(){
        cont = 0;
    }

    public static int obterValor(){
        return cont;
    }
}
