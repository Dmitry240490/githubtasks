package coding.fibonacci_package_10;

import java.util.Arrays;
import java.util.stream.Stream;

// TODO: Задание. Вычислить число Фибоначчи
public class Fibonacci {

    public static void main(String[] args) {
        int k = 11;
        int[] numbers = new int[k];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 1;
        for (int i = 3; i < numbers.length; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }
        int result = Stream.iterate(new int[]{0, 1}, array -> new int[]{array[1], array[0] + array[1]})
                .limit(k)
                .map(t -> t[0])
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(Arrays.toString(numbers));
        System.out.println("Сумма чисел Фибоначчи по n-й элемент включительно: " + result);
    }
}