import java.util.Arrays;
import java.util.List;

public class Exercicio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).toList();

        if (pares.isEmpty()){
            System.out.println("não há numeros pares na lista");
            System.out.println(impares);
        } else if (impares.isEmpty()) {
            System.out.println("não há numeros ímpares na lista");
            System.out.println(pares);
        }else {
            System.out.println(pares);
            System.out.println(impares);
        }
    }
}
