import java.util.Arrays;
import java.util.List;

public class Exercicio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, -7, 5, 6, 7, 8, 9, -12, 10, 5, 4, 3);

        List<Integer> negativos = numeros.stream()
                .filter(n -> n < 0)
                .toList();

        if (negativos.isEmpty()) {
            System.out.println("Não há números negativos");
        } else {
            System.out.println("Números negativos na lista: " + negativos);
        }

    }
}
