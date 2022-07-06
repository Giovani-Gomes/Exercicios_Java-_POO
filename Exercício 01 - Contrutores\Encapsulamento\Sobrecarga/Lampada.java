package Exercicios.java;

public class Lampada {
    String marca;
    double voltagem;
    String tipo;
    String modelo;
    String cor;
    double preço;
    int garantia;
    boolean ligada;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    

    public Lampada(String marca, double voltagem, String tipo, String modelo, String cor, double preço, int garantia, boolean ligada) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.preço = preço;
        this.garantia = garantia;
        this.ligada = ligada;
    }

    public Lampada() {
    }

    void ligar(){
        setLigada(true);
    }
    void desligar(){
        setLigada(false);
    }
    void mostrarEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}
