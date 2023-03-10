package br.com.abc.introducao.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};   // tamanho 5 porem o indicie so vai ate 4 ( lembrar que começa do 0)
        int[] numeros3 = new int[] {1,2,3,4,5};

//        for(int i=0; i < numeros2.length ; i++) {
//            System.out.println(numeros2[i]);
//        }

        for(int aux : numeros2) {    // foreach, foi criado pois tem a sintaxe mais simples
            System.out.println(aux);
        }
    }
}
