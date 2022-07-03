package Exercicios.java;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      BibliotecaLivro livro = new BibliotecaLivro();


      livro.nome = "12 Regras para Vida";
      livro.autor = "Jordan Peterson";
      livro.anoLancamento = 2018;
      livro.preco = 32.90;
      livro.isbn = "9788550802756";
      livro.dataEntrega = new Date();

      System.out.println("NOME - " + livro.nome);
      System.out.println("AUTOR - " + livro.autor);
      System.out.println("ANO DE LANÇAMENTO - " + livro.anoLancamento);
      System.out.println("PREÇO - " + livro.preco);
      System.out.println("ISBN - " + livro.isbn);
      System.out.println("DATA DE ENTREGA " + livro.dataEntrega);



    }
}