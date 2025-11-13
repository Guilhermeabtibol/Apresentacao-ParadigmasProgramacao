/*
Paradigma Declarativo
---------------------
- Descreve o que deve ser feito, e não como fazer.
- Java aplica esse conceito com Streams e SQL-like APIs.
*/

import java.util.List;

public class Declarativo {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        long pares = numeros.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Quantidade de pares: " + pares);
    }
}
