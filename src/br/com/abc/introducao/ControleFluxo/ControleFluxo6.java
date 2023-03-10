package br.com.abc.introducao.ControleFluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {

        /*
        dado o valor de um carro descubra em quantas vezes ele pode ser parcelado,
        as parcelas nao podem ser menos do que 1000 reais
         */

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

    }


}

