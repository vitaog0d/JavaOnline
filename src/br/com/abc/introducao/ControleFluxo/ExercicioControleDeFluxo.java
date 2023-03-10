package br.com.abc.introducao.ControleFluxo;

public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        /*
        crie uma variavel salario e imprima seu imposto
        imposto:
        salario < 1000 5% de imposto
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 4000 15%
        salario > 5000 20%
         */

        float salario = 900;

        if(salario < 1000 ) {
            System.out.println("Seu salario tem de imposto = " +salario * 0.05 );
        } else if(salario >= 1000 && salario < 2000) {
            System.out.println("Seu salario tem de imposto = " +salario * 0.1);
        } else if (salario >= 2000 && salario < 4000) {
            System.out.println("Seu salario tem de imposto = " +salario * 0.15);
        } else if (salario > 5000 ) {
            System.out.println("Seu salario tem de imposto = " +salario * 0.20);
        }
    }
}
