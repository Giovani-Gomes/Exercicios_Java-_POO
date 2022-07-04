package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.nome = "Preço da Desonta";
        livro1.autor = "Hiroshi Hirata";
        livro1.qtdPaginas = 385 ;
        livro1.categoria = "História em Quadrinho/Mangá";
        livro1.editora = "Pipoca e Nanquin";
        livro1.Genero = "Drama";

        System.out.println("NOME - " + livro1.nome);
        System.out.println("AUTOR - " + livro1.autor);
        System.out.println("QUANTIDADE DE PÁGINAS - " + livro1.qtdPaginas);
        System.out.println("CATEGORIA - " + livro1.categoria);
        System.out.println("EDITORA - " + livro1.editora);
        System.out.println("GÊNERO - " + livro1.Genero);
        

    }
}