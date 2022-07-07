package Exercicios.java;

public class ContaCorrente {
    private int numConta;
    private String nome;
    private String banco;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;

    public ContaCorrente(int numConta, String nome, String banco, boolean especial, double limiteEspecial, double saldo) {
        this.numConta = numConta;
        this.nome = nome;
        this.banco = banco;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
    }

    public ContaCorrente() {
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

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
