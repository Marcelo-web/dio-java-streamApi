package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {

        // Agrupe os números em pares e ímpares.
        // Utilize a Stream API para agrupar os números em duas listas separadas:
        // - uma contendo os números pares
        // - outra contendo os números ímpares da lista original.
        // Exiba os resultados no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> grupos = numeros.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));


        List<Integer> numerosPares = grupos.get(true);
        List<Integer> numerosImpares = grupos.get(false);

        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números ímpares: " + numerosImpares);
    }
}
