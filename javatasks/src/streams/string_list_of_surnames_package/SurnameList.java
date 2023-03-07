package streams.string_list_of_surnames_package;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// TODO: Задание. Создать коллекцию целых чисел, написать метод: Есть стринговый лист фамилий, нужно пройтись по списку,
//  вытащить фамилии которые начинаются на А и поместить их в другой список для дальнейшей работы с ними
public class SurnameList {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Афанасьев");
        stringList.add("Петров");
        stringList.add("Смирнов");
        stringList.add("Арсеньев");
        stringList.add("Андронов");

        List<String> resultList = stringList.stream()
                .filter(s -> s.startsWith("А"))
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}