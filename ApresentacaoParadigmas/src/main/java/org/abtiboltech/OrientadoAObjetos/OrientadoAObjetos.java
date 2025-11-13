/*
Paradigma Orientado a Objetos (POO)
-----------------------------------
- Usa objetos que representam entidades do mundo real.
- Principais pilares: Encapsulamento, Herança e Polimorfismo.
*/

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

public class OrientadoAObjetos {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Guilherme", 21);
        p.apresentar();
    }
}
