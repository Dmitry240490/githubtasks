package streams.count_sum_odd_numbers_package;

import java.util.stream.Stream;

// TODO: Задание. Найти сумму нечетных чисел в коллекции
public class CountSumOddNumbers {

    public static void main(String[] args) {
        int result = Stream.of(1, 2, 3, 4, 5, 11)
                .filter(x -> x % 2 != 0)
                .reduce(Integer::sum)
                .orElseThrow(RuntimeException::new);
        System.out.println(result);
    }
}