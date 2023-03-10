package br.com.abc.introducao.ControleFluxo;

public class ControleDeFluxo1 {
    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >= 15 e < 18 categoria juvenil
        // idade >= 18 adulto
        int idade = 22;



        if (idade < 15) {

            System.out.println("Categoria Infantil");
        } else if (idade >=15 && idade < 18 ){               // && mesmo que and
            System.out.println("Categoria juvenil ");

        } else if (idade >=18) {
            System.out.println("Categoria adulto ");
        }
    }
}