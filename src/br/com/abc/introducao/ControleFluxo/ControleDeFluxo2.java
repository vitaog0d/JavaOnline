package br.com.abc.introducao.ControleFluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        status = idade < 18  ? "Não adulto " : "Adulto ";
        System.out.println(status);

    }
}
