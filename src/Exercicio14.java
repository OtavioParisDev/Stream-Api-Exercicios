import java.util.*;
import java.util.stream.*;

public class Exercicio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Exercicio14::ehPrimo)
                .max(Integer::compareTo);

        if (maiorPrimo.isPresent()) {
            System.out.println("Maior número primo: " + maiorPrimo.get());
        } else {
            System.out.println("Nenhum número primo encontrado.");
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}