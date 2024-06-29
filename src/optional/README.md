### Optional

- O Optional é uma classe introduzida no Java 8 com o objetivo de simplificar o tratamento de valores possivelmente
  nulos.
- Ele oferece uma maneira segura e clara de lidar com situações em que um valor pode ou não estar presente.
- Aqui estão algumas informações sobre o Optional:

1. **Evitar exceções**

- O principal propósito do Optional é evitar exceções, como *NullPointerException*.
- Em vez de retornar null, você pode usar Optional para indicar que um resultado pode existir ou não.

2. **Como usar**

- ``of(value)``: Cria uma instância de Optional com o valor especificado. Se o valor não for nulo, pode ser retornado.
  Se o valor for nulo, uma exceção NullPointerException será lançada.

```
    Optional<String> optionalNome = Optional.of("Maria");
    System.out.println(optionalNome.get());
```

- ``ofNullable(value)``: Cria uma instância de Optional com o valor especificado. Se o valor não for nulo, ele é
  considerado presente. Se o valor for nulo, uma instância vazia do Optional é retornada.

```
   Optional<String> optionalCidade = Optional.ofNullable(null);
   System.out.println(optionalCidade.isPresent()); 
```

- ``empty()``: Cria uma instância vazia da classe Optional. Essa instância não contém nenhum valor.

```
  Optional<Integer> numeroVazio = Optional.empty();
  System.out.println(numeroVazio.isPresent());
```

- ``isPresent()``: Verifica se há um valor presente na instância do Optional. Ele retorna true se houver um valor
  presente e false, caso contrário.

````
  Optional<Integer> numero = Optional.of(42); 
  System.out.println(numero.isPresent());
````

- ``isEmpty()``: Verifica se há um valor presente na instância do Optional. Ele retorna true se não houver um valor
  presente (ou seja, o Optional estiver vazio) e false, caso contrário.

````
  Optional<Integer> numeroVazio = Optional.empty(); 
  System.out.println(numeroVazio.isEmpty());
````

- ``get()``: Retorna o valor presente no Optional. Se não houver valor presente (ou seja, o Optional estiver vazio), ele
  lança uma exceção do tipo *NoSuchElementException*.

```
  Optional<Integer> numero = Optional.empty();
  System.out.println(numero.get());
```

- ``orElse(defaultValue)``:  Retorna o valor presente no Optional. Se não houver valor presente (ou seja, o Optional
  estiver vazio), ele retorna o valor padrão especificado.

```
  Optional<String> optionalValue = Optional.ofNullable(null);
  String result = optionalValue.orElse("Padrão");
  System.out.println(result);
```

- ``orElseGet(supplier)``: Retorna o valor presente no Optional. Se não houver valor presente (ou seja, o Optional
  estiver vazio), ele invoca o fornecedor (uma função) e retorna o resultado dessa invocação.

```
  Optional<Integer> numero = Optional.empty(); 
  int valorGerado = numero.orElseGet(() -> (int) (Math.random() * 100));
  System.out.println("Valor obtido: " + valorGerado);
```

- ``orElseThrow(exceptionSupplier)``: Retorna o valor presente no Optional. Se não houver valor presente (ou seja, o Optional estiver vazio), ele invoca o fornecedor (uma função) e lança a exceção gerada por essa invocação.

```
  Optional<String> optionalValue = Optional.ofNullable(null);
  String result = optionalValue.orElseThrow(() -> new RuntimeException());
```

- ``ifPresent(consumer)``: Executa uma ação se um valor estiver presente. Ele aceita um Consumer que define a ação a ser realizada com o valor presente.
```
  Optional<String> optionalUser = Optional.of("Maria");
  optionalUser.ifPresent(user -> System.out.println("Usuário: " + user));
```
