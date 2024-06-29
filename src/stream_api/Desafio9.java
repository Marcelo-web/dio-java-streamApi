package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {

        // Verificar se todos os números da lista são distintos (não se repetem).
        // Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream()
                .allMatch(n -> numeros.indexOf(n) == numeros.lastIndexOf(n));

        System.out.println(todosDistintos ? "Todos são distintos" : "Nem todos são distintos");

        // 2º modo
        int totalElementosConjunto = numeros.stream().collect(Collectors.toSet()).size();
        System.out.println(totalElementosConjunto == numeros.size() ? "Todos são distintos" : "Nem todos são distintos");
    }
}
