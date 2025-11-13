/*
Paradigma Estruturado
---------------------
- Divide o programa em funções bem definidas.
- Evita o uso de comandos “goto”.
- Torna o código mais legível e modular.
*/

public class Estruturado {
    static int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = soma(3, 5);
        System.out.println("Resultado da soma: " + resultado);
    }
}
