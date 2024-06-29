package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {

        // Calcule a média dos números maiores que 5 .
        // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        var mediaMaioresQue5 = numeros.stream().filter(n -> n > 5)
                .mapToDouble(Double::valueOf)
                .average().orElse(0.0);

        System.out.println(mediaMaioresQue5);

    }
}
