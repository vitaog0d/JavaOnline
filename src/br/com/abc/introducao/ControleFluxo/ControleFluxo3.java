package br.com.abc.introducao.ControleFluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        /*
        tipos de variaveis em que se pode utilizar "switch" são = char, int, byte, short, enum e String
         */
        switch (dia){
            case 1:
                System.out.printf("Domingo\n");
                break;
            case 2 :
                System.out.printf("Segunda\n");
                break;
            case 3:
                System.out.printf("Terça\n");
                break;
            case 4:
                System.out.printf("Quarta\n");
                break;
            case 5:
                System.out.printf("Quinta\n");
                break;
            case 6:
                System.out.printf("Sexta\n");
                break;
            case 7:
                System.out.printf("Sabado\n");
                break;

        }
        String sexo = "F";
        switch(sexo){
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}
