package br.com.abc.introducao.ControleFluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        /*
        crie um switch que dado um valor de 1 a 7, considerando 1 domingo
        imprima se é dia util ou final de semana
         */

        int dia = 10;
        switch(dia){
            case 1:
                System.out.println("Domingo");
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Terça");
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Sabado");
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("opcao invalida");
                break;
        }
    }
}
