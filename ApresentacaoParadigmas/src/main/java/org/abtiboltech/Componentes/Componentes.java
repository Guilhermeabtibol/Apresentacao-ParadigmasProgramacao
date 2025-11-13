/*
Paradigma Orientado a Componentes
---------------------------------
- Foco em componentes independentes e reutilizáveis.
- Usa interfaces e injeção de dependência.
*/

interface Repositorio {
    void salvar(String dado);
}

class RepositorioBanco implements Repositorio {
    public void salvar(String dado) {
        System.out.println("Salvando no banco: " + dado);
    }
}

public class Componentes {
    public static void main(String[] args) {
        Repositorio repo = new RepositorioBanco(); // componente injetado
        repo.salvar("Usuário Guilherme");
    }
}
