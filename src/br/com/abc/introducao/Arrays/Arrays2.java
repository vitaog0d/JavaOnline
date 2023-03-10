package br.com.abc.introducao.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        //byte, short, int, doble, float, long = 0 padrão array
        //char = " "
        //boolean = false
        //reference = null

        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "Joao";
        nomes[2] = "Isabela";
        nomes[3] = "Pedro";

        for( int i=0; i<nomes.length; i++) {      // .length retorna o tamanho do array
            System.out.println(nomes[i]);
        }



    }
}
