package br.com.abc.introducao.Operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // operadores de atribuicao
        // = , -= , += , *= , /= , %=

        int salario = 1800;
        salario = salario + 1000; // isso
        salario += 1000; // faz o mesmo que isso.  (aumentando 1000 no salario)
        salario -= 1000; // (diminuindo 1000 no salario)

        System.out.println(salario);
    }
}
