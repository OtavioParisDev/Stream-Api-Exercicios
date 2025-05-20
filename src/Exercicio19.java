import java.util.Arrays;
import java.util.List;

public class Exercicio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

        List<Integer> divisiveis = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .toList();

        int somaDivisiveis = divisiveis.stream()
                .reduce(0, Integer::sum);


        System.out.println(divisiveis);
        System.out.println(somaDivisiveis);

    }
}
