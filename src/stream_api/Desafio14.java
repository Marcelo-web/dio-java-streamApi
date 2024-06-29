package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio14 {
    public static void main(String[] args) {

        // 	Encontre o maior número primo da lista.
        //  Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // n > 1: garante que o número seja maior que 1 (pois 1 não é primo).
        // IntStream.rangeClosed(2, (int) Math.sqrt(n)): cria um stream de inteiros de 2 até a raiz quadrada do número.
        // noneMatch:  verifica se nenhum desses inteiros divide exatamente o número n.
        // Retorna um set de primos inteiros contendo valores distintos.
        var primosSet = numeros.stream()
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0))
                .collect(Collectors.toSet());

        // Obtém o maior número primo ou lança uma exceção.
        int maiorNumeroPrimo = primosSet.stream().max(Integer::compare).orElseThrow();
        System.out.println(maiorNumeroPrimo);

        // 2º modo para obter o maior número primo.
        // organizando os números primos em ordem decrescente.
        // recuperando o primeiro valor (maior número).
        primosSet.stream().sorted((a, b) -> b - a).findFirst().ifPresent(System.out::println);
    }
}
