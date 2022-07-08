package Exercicios.java;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas = new String[3];
    private double[][] notasDisciplinas = new double[3][4]; // 3 para as Disciplinas e a média

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notasDisciplinas = notasDisciplinas;
    }

    public Aluno() {

    }

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

    private double obterMedia(int indice) {

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }
    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.disciplinas[pos] = nomeDisciplina;
    }

    public void setNotaDisciplinaPosIJ(int posI, int posJ, double nota){
        this.notasDisciplinas[posI][posJ] = nota;
    }
}
