import java.util.Arrays;
import java.util.List;

public class Exercicio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1);

        boolean iguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        System.out.println("todos os numeros são iguais? " + iguais);
        System.out.println(numeros);
    }
}
