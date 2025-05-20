import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()  //remove duplicatas
                .sorted(Comparator.reverseOrder()) //Ordena em ordem decrescente
                .skip(1) // pula o primeiro
                .findFirst(); // pega o segundo número

        segundoMaior.ifPresent(n -> System.out.println("Segundo maior número é: " + n));
    }

}
