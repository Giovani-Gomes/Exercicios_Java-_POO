    package Exercicios.java;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
           imprimirTela(ConversaoDeUnidadesDeTempo.minutosParaSegundos(1));
           imprimirTela(ConversaoDeUnidadesDeTempo.diasParaHoras(7));
           imprimirTela(ConversaoDeUnidadesDeTempo.mesesParaDias(9));
           imprimirTela(ConversaoDeUnidadesDeTempo.semanasParaDias(45));
           imprimirTela(ConversaoDeUnidadesDeTempo.horasParaMinutos(25));
        }
        static void imprimirTela(int num){
            System.out.println(num);
        }
    }