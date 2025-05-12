import java.util.Arrays;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, -7, 8, 9, 10, 5, 4, 3);

        boolean numerosPositivos = numeros.stream()
                                          .allMatch(n -> n > 0);

        if (!numerosPositivos) {
            System.out.println("Existem numeros negativos");
        } else {
            System.out.println("Todos os numeros são positivos");
        }
        System.out.println(numeros.stream().sorted().toList());
    }
}
