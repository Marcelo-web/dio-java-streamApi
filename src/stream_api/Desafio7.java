package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {

        // Encontrar o segundo número maior da lista.
        // Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // - Etapas
        // 1 - Ordenar lista em ordem decrescente
        // 2 - Remover duplicatas de modo que o segundo número seja único
        // 3-  Pular o primeiro elemento(maior número)
        // 4-  Em seguida, obter o novo primeiro da lista(segundo número)
        // 5-  Senão lança uma exceção

        int segundoMaior = numeros.stream()
                .sorted((a, b) -> b - a)
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(segundoMaior);
    }
}
