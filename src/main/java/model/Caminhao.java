package model;

import javax.swing.*;

public class Caminhao {

    private int toneladas;
    private double alturaMax;
    private double comprimento;

    public Caminhao() {
        this(0, 0, 0);
    }

    public Caminhao(int toneladas, double alturaMax, double comprimento) {
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public double getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void leitura() {
        setToneladas(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga maxima(em toneladas) do caminhao: ")));
        setAlturaMax(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura maxima do caminhao: ")));
        setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do caminhao: ")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Caminhao:\nCarga Maxima: " + getToneladas() + " toneladas\nAltura Maxima: " + getAlturaMax()
                + " m\nComprimento: " + getComprimento() + " m");
    }
}
