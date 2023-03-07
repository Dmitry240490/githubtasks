package streams.even_odd_numbers_package;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// TODO: Задание. Создать коллекцию целых чисел, написать метод:
//  Который четные числа умножает на 100, а от нечетных отнимает 100 и возвращает коллекцию.
//  Количество принимаемых и возвращаемых элементов коллекций должно совпадать
public class EvenOddNumber {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(4);
        integerList.add(3);
        integerList.add(7);
        integerList.add(2);
        System.out.println(integerList);

        List<Integer> resultList = integerList.stream().map(integer -> {
            int result;
            if (integer % 2 == 0) {
                result = integer * 100;
            } else {
                result = integer - 100;
            }
            return result;
        }).collect(Collectors.toList());
        System.out.println(resultList);
    }
}