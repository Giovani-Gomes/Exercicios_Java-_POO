package Exercicios.java;

public class Lampada {
    String marca;
    double voltagem;
    String tipo;
    String modelo;
    String Cor;
    double Preço;
    int Garantia;
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
    void mostrarEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}
