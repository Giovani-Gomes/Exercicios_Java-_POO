    package Exercicios.java;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
          imprimirTela(ConversaoDeUnidadeDeVolume.litroParaCentimetrosCubicos(1));
          imprimirTela(ConversaoDeUnidadeDeVolume.metrosCubicosParaLitros(1));
          imprimirTela(ConversaoDeUnidadeDeVolume.metrosCubicosParaPesCubicos(1));
          imprimirTela(ConversaoDeUnidadeDeVolume.galaoAmericanoParaPolegadasCubicas(1));
          imprimirTela(ConversaoDeUnidadeDeVolume.galaoAmericanoParaLitros(1));
        }
        static void imprimirTela(double num){
            System.out.println(num);
        }
    }