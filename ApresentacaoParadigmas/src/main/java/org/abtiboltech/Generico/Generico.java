/*
Paradigma Genérico
------------------
- Permite escrever código independente do tipo de dado.
- Promove reuso e segurança de tipo em tempo de compilação.
*/

class Caixa<T> {
    private T valor;

    public void set(T valor) {
        this.valor = valor;
    }

    public T get() {
        return valor;
    }
}

public class Generico {
    public static void main(String[] args) {
        Caixa<Integer> c = new Caixa<>();
        c.set(42);
        System.out.println("Valor na caixa: " + c.get());
    }
}
