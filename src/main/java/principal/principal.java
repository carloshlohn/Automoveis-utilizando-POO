package principal;

import model.Veiculo;
import model.CarroPasseio;
import model.Caminhao;
import javax.swing.*;

public class principal {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.leitura();
        veiculo.imprimir();

        CarroPasseio carro = new CarroPasseio();
        carro.leitura();
        carro.imprimir();

        Caminhao caminhao = new Caminhao();
        caminhao.leitura();
        caminhao.imprimir();
    }
}
