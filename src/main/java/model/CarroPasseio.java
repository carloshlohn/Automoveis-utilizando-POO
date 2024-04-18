package model;

import javax.swing.*;

public class CarroPasseio extends Veiculo {

    private String cor;
    private String modelo;

    public CarroPasseio() {
        this("", "");
    }

    public CarroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void leitura() {
        setCor(JOptionPane.showInputDialog("Digite a cor do carro para passeio:"));
        setModelo(JOptionPane.showInputDialog("Digite o modelo do carro para passeio: "));
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Carro (Passeio) \nCor: " + getCor() + "\nModelo: " + getModelo());
    }
}
