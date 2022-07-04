package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      Aluno aluno = new Aluno();

        System.out.print("Entre com o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.print("Entre com o nome do curso: ");
        aluno.curso = scan.next();

        System.out.print("Entre com a Matricula: ");
        aluno.matricula = scan.next();
        
        for (int i=0; i<aluno.disciplinas.length; i++){
            System.out.println("Informe o nome da disciplina " + i);
            aluno.disciplinas[i] = scan.next();
        }

        for (int i=0; i<aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.disciplinas[i]);
            for (int j=0; j<aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }
        aluno.mostrarInformaçoes();

        for (int i=0; i<aluno.disciplinas.length; i++){
            if (aluno.verificarSituacao(i)){
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - reprovado");
            }
        }

    }
}