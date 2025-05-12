import java.util.Arrays;
import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 10,9 ,9 , 4, 5, 5, 5, 5, 4, 3);

        List<Integer> mediaMaiorQue5 = numeros.stream()
                                              .filter(n -> n > 5)
                                              .toList();

            if (!mediaMaiorQue5.isEmpty()){
                double soma = mediaMaiorQue5.stream().reduce(0, (n1, n2) -> n1 + n2);
                double media = soma / mediaMaiorQue5.size();
                System.out.println("Média dos numeros maiores que 5: " + media);
        }else {
                System.out.println("A lista não possui numeros maiores que 5!");
            }
    }
}
