import java.util.Arrays;
import java.util.List;

public class Exercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 10, 9, 9, 4, 5, 5, 5, 5, 4, 3, 15, 37, 100, 14, 98);

        List<Integer> numerosMaioresQueDez = numeros.stream()
                .filter(n -> n > 10)
                .toList();

        if (numerosMaioresQueDez.isEmpty()) {
            System.out.println("A lista não contem números maiores que 10!");
        } else {
            System.out.println("Os seguintes números na lista são maiores que 10: ");
            System.out.println(numerosMaioresQueDez.stream()
                    .sorted()
                    .toList());
        }
    }
}
