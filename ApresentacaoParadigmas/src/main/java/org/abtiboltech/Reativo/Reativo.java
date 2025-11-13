/*
Paradigma Reativo
-----------------
- Baseado em fluxo de eventos assíncronos.
- Usa CompletableFuture ou bibliotecas como RxJava/Reactor.
*/

import java.util.concurrent.CompletableFuture;

public class Reativo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "Processando...")
                .thenApply(msg -> msg + " pronto!")
                .thenAccept(System.out::println);
    }
}
