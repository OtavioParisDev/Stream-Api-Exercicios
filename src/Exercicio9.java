import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercicio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> repetidos = numeros.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) //agrupa e conta
                .entrySet().stream()
                .filter(n -> n.getValue() > 1) // filtra os que aparecem mais de uma vez
                .map(Map.Entry::getKey) // pega apenas o numero
                .collect(Collectors.toList()); // coleta em uma lista


        if (repetidos.isEmpty()) {
            System.out.println("não há números repetidos");
        } else {
            System.out.println("Os numeros repetidos na lsita são: ");
            System.out.println(repetidos.stream().sorted().toList());
        }

    }
}
