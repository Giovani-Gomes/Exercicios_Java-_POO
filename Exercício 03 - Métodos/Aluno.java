package Exercicios.java;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4]; // 3 para as Disciplinas e a média

    void mostrarInformaçoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i=0; i<notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j=0; j<notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarSituacao(int indice){

        if (obterMedia(indice) >= 7){
            return true;
        }

        return false;
    }

    double obterMedia(int indice) {

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }
}
