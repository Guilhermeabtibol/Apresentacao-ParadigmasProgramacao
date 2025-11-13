/*
Paradigma Funcional
-------------------
- Evita modificar variáveis (imutabilidade).
- Usa funções puras, lambdas e streams.
- Foco no “o que fazer”, não “como fazer”.
*/

import java.util.Arrays;

public class Funcional {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
