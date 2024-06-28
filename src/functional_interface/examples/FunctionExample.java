package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {

        // Criar uma lista de números inteiros.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com expressão lambda para dobrar todos os números.
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar uma função para dobrar todos os números no Stream e armazená-los em outra lista.
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        // Imprimir a lista de números dobrados.
        numerosDobrados.forEach(n -> System.out.print(n + " "));

        System.out.println();

        //2º modo
        numerosDobrados = numeros.stream()
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer numero) {
                        return numero * 2;
                    }
                })
                .toList();

        numerosDobrados.forEach(n -> System.out.print(n + " "));

        System.out.println();

        //3º modo
        numerosDobrados = numeros.stream()
                .map(n -> n * 2).toList();

        numerosDobrados.forEach(System.out::println);
    }
}
