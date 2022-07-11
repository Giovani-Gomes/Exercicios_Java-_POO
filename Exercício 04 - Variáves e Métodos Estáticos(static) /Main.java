    package Exercicios.java;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
          imprimirTela(ConversaoDeUnidadeDeArea.metroParaPes(1));
          imprimirTela(ConversaoDeUnidadeDeArea.pesParaCentimetros(1));
          imprimirTela(ConversaoDeUnidadeDeArea.milhaParaAcres(1));
          imprimirTela(ConversaoDeUnidadeDeArea.acresParaPes(1));
        }
        static void imprimirTela(double num){
            System.out.println(num);
        }
    }