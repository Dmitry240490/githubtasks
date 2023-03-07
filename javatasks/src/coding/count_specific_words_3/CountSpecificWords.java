package coding.count_specific_words_3;

import java.util.HashMap;

// TODO: Задание. Подсчитать количество конкретных слов в строке "Упади семь раз и восемь раз поднимись",
//  используя HashMap
public class CountSpecificWords {

    public static void main(String[] args) {
        String string = "Упади семь раз и восемь раз поднимись";
        String[] words = string.split(" ");
        HashMap<String, Integer> keyValue = new HashMap<>();

        for (int i = 0; i <= words.length - 1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter + 1);
            } else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);
    }
}