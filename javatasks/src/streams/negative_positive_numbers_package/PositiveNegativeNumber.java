package streams.negative_positive_numbers_package;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// TODO: Задание. Создать коллекцию целых чисел, написать метод:
//  Который отрицательные числа делает положительными и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])
public class PositiveNegativeNumber {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(-3);
        integerList.add(7);
        System.out.println(integerList);

        List<Integer> resultList = integerList.stream()
                .map(Math::abs)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}