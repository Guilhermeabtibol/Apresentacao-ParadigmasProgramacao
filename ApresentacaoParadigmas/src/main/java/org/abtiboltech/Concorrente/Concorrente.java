package org.abtiboltech.Concorrente;/*
Paradigma Concorrente
---------------------
- Permite que partes do código executem ao mesmo tempo.
- Utiliza Threads para tarefas paralelas.
*/

public class Concorrente {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread 1 rodando"));
        Thread t2 = new Thread(() -> System.out.println("Thread 2 rodando"));

        t1.start();
        t2.start();
    }
}
