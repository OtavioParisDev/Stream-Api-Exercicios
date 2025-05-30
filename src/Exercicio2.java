import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        //criar lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
            //  .reduce(0, (n1, n2) -> n1 + n2)

        System.out.println("A soma dos números pares é: " + somaPares);
    }
}
