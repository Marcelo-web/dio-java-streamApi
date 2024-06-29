package stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
    public static void main(String[] args) {

        // Agrupe os valores ímpares múltiplos de 3 ou de 5.
        // Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> multiplosDe3Ou5 =
                numeros.stream()
                        .collect(Collectors.groupingBy(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)));

        System.out.println(new HashSet<>(multiplosDe3Ou5.get(true)));
    }
}
