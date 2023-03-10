package br.com.abc.introducao.ControleFluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 11;

        while(contador <10){
            System.out.println(contador++);  // se for falso nao roda
        }

        do{
            System.out.println("dentro do do while");  // roda independente de ser verdadeiro ou falso
        }while(contador < 10);

        for(int i=0; i<10; i++) {
            System.out.println("O valor de i eh " +i );
        }



    }
}
