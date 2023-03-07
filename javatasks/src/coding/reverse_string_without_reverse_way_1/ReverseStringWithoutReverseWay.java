package coding.reverse_string_without_reverse_way_1;

// TODO: Задание. Перевернуть строку «Никогда не ошибается тот, кто ничего не делает», изменив расположение символов
//  в строке задом наперёд без использования встроенной в String функции reverse()
public class ReverseStringWithoutReverseWay {

    public static void main(String[] args) {
        String string = "Никогда не ошибается тот, кто ничего не делает";
        int length = string.length();
        char[] chars = new char[length];
        int counter = 0;
        for (int i = length - 1; i >= 0; i--) {
            char currentChar = string.charAt(i);
            chars[counter++] = currentChar;
        }
        System.out.println(new String(chars));
    }
}