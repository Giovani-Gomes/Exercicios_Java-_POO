package Exercicios.java;

public class JogoDaVelha {
    private char[][] jogoVelha;
    private int jogada;

    public JogoDaVelha() {
        jogoVelha = new char[3][3];
        jogada = 1;
    }

    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }


    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
            return false;

        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean verificarGanhador(char sinal) {
        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) ||
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) ||
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) ||
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) ||
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {
            return true;
        }
        return false;
    }

    public boolean vezJogador1(){
        if (jogada % 2 == 1){
            return true;
        }
        return false;
    }
}