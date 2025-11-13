package org.abtiboltech.Imperativo;/*
Paradigma Imperativo
---------------------
- Baseado em instruções passo a passo.
- O programador controla o estado e a ordem das operações.
- Muito usado em linguagens tradicionais como C e Java.
*/

public class Imperativo {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            soma += i; // modifica o estado da variável
        }
        System.out.println("Soma = " + soma);
    }
}
