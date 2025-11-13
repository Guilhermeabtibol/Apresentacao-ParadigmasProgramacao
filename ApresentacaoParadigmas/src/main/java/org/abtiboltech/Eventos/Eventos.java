package org.abtiboltech.Eventos;/*
Paradigma Orientado a Eventos
-----------------------------
- A execução depende de eventos externos (cliques, mensagens, etc).
- Muito usado em GUIs e aplicações web.
*/

import javax.swing.*;

public class Eventos {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Evento Java");
        JButton botao = new JButton("Clique!");

        botao.addActionListener(e -> System.out.println("Botão clicado!"));

        frame.add(botao);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
