package Exercicios.java;

public class Main {
    public static void main(String[] args) {

      Contato contato1 = new Contato();

      contato1.nome = "Roberto Carlos";
      contato1.ativo = false;
      contato1.email = "Robertocarlos@mail.com";
      contato1.telefones = new String[2];
      contato1.telefones[0] = "999874145245";
      contato1.telefones[1] = "814572115348";
      contato1.endereco = "Brasil - São Paulo";

      System.out.println("NOME - " + contato1.nome);
      System.out.println("EMAIL - " + contato1.email);
      System.out.println("ENDEREÇO - " + contato1.endereco);
      System.out.println("TELEFONE 1 - " + contato1.telefones[0]);
      System.out.println("TELEFONE 2 - " + contato1.telefones[1]);
      System.out.println("ATIVO - " + contato1.ativo);



    }
}