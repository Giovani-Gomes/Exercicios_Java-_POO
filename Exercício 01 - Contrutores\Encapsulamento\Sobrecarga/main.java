package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada("Yamamura",48,"Led","Ya23452i","Branca",24,48,true);

        System.out.println("COR - " + lampada.getCor());
        System.out.println("MARCA - " + lampada.getMarca());
        System.out.println("MODELO - " + lampada.getModelo() );
        System.out.println("PREÇO - R$" + lampada.getPreço());
        System.out.println("VOLTAGEM - " + lampada.getVoltagem());
        System.out.println("TIPO - " + lampada.getTipo());
        System.out.println("GARANTIA - " + lampada.getGarantia());
        
        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();



    }
}