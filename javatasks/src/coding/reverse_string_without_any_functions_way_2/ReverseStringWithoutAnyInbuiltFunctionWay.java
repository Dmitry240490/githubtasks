package coding.reverse_string_without_any_functions_way_2;

// TODO: Задание. Перевернуть строку «Никогда не ошибается тот, кто ничего не делает», изменив расположение символов
//  в строке задом наперёд без использования встроенных в String функций
public class ReverseStringWithoutAnyInbuiltFunctionWay {

    public static void main(String[] args) {
        String string = "Никогда не ошибается тот, кто ничего не делает";
        char[] charArray = string.toCharArray();

        int counterFirstElement = 0;
        int counterLastElement = charArray.length - 1;

        while (counterFirstElement < counterLastElement) {
            char temp = charArray[counterFirstElement];
            charArray[counterFirstElement] = charArray[counterLastElement];
            charArray[counterLastElement] = temp;
            counterFirstElement++;
            counterLastElement--;
        }
        System.out.println(new String(charArray));
    }
}