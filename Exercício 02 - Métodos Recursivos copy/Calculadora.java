package Exercicios.java;

public class Calculadora {

    public static int somar (int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair (int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar (int num1, int num2){
        return num1 * num2;
    }
    public static int potenciacao (int num1, int num2){

        int total = 1;
        for (int i=1; i<=num2; i++){
            total *= num1;
        }

        return total;
    }


    public static int fatorial(int num){

        if (num == 0){
            return 1;
        }

        int total = 1;
        for (int i=num; i>1; i--){
            total *= i;
        }

        return total;
    }

    public static int dividir (int num1, int num2){
        return num1 / num2;
    }
    public static int fibonacci(int num){

        if (num < 2){
            return 1;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }
    public static int somatorio(int num){

        if (num == 1){
            return 1;
        }

        return num + somatorio(num-1);
    }
}
