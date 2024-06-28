package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usado para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {

        // Usar um Supplier com expressão lambda para fornecer uma saudação personalizada.
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        // Usar um Supplier para obter uma lista com saudações.
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        // Imprimir as saudações geradas.
        listaSaudacoes.forEach(System.out::println);

        System.out.println();

        //2º modo
        listaSaudacoes = Stream.generate(new Supplier<String>() {
                    @Override
                    public String get() {
                        return "Olá, seja bem vindo(a)!";
                    }
                })
                .limit(3).toList();

        listaSaudacoes.forEach(System.out::println);

        System.out.println();

        //3º modo
        listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!").limit(2).toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
