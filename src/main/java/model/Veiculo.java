package model;

import javax.swing.*;

public class Veiculo {

    private int pesoKG;
    private int velocMax;
    private float preco;

    public Veiculo() {
        this(0, 0, 0);
    }

    public Veiculo(int pesoKG, int velocMax, float preco) {
        this.pesoKG = pesoKG;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public int getPesoKG() {
        return pesoKG;
    }

    public void setPesoKG(int pesoKG) {
        this.pesoKG = pesoKG;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void leitura() {
        setPesoKG(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do veiculo em KG: ")));
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade do veiculo: ")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preco do veiculo: ")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Veiculo: \nPeso: " + getPesoKG() + "KG\nVelocidade: " + getVelocMax() + "km/h\nPreco: R$" + getPreco());
    }
}
