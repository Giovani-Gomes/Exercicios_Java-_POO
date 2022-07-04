package Exercicios.java;

public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.Cor = "Branca";
        lampada.marca = "Yamamura";
        lampada.modelo = "Ya23452i";
        lampada.Preço = 23.90;
        lampada.voltagem = 24;
        lampada.tipo = "Led";
        lampada.Garantia = 24;
        
        lampada.ligar();
        lampada.mudarEstado();

        System.out.println("COR - " + lampada.Cor);
        System.out.println("MARCA - " + lampada.marca);
        System.out.println("MODELO - " + lampada.modelo);
        System.out.println("PREÇO - R$" + lampada.Preço);
        System.out.println("VOLTAGEM - " + lampada.voltagem);
        System.out.println("TIPO - " + lampada.tipo);
        System.out.println("GARANTIA - " + lampada.Garantia + " Meses");
        System.out.println("ESTADO - " + lampada.ligada);
    }
}