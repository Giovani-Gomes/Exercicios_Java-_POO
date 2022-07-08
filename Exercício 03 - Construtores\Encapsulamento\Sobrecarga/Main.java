package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setCurso(scan.next());

        System.out.println("Entre com a matricula");
        aluno.setMatricula(scan.next());


        for (int i=0; i<aluno.getDisciplinas().length; i++){
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplinaPos(i, scan.next());
        }

        for (int i=0; i<aluno.getNotasDisciplinas().length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.getDisciplinas()[i]);
            for (int j=0; j<aluno.getNotasDisciplinas()[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.setNotaDisciplinaPosIJ(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInformaçoes();

        for (int i=0; i<aluno.getDisciplinas().length; i++){
            if (aluno.verificarSituacao(i)){
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - reprovado");
            }
        }
    }
}