package Exercicios.java;

public class ContaCorrente {
    int numConta;
    String nome;
    String banco;
    boolean especial;
    double limiteEspecial;
    double saldo;

    void saldo(){
        System.out.println("SALDO - R$ " + saldo + " Reais");;
    }
    boolean realizarSaque(double quantiaASacar){
        if (saldo >= quantiaASacar){
            saldo = saldo - quantiaASacar;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar){
                    saldo = saldo - quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

    }

    void depositar(double valorDepositado){
        saldo = saldo + valorDepositado;
    }
    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
