package coding.countExactCharOfString_6;

// TODO: Задача. Подсчитать сколько раз символ "в" встречается в строке "Работать нужно не 12 часов, а головой!",
//  учитывая различные раскладки.
public class CountExactCharOfString {

    public static void main(String[] args) {
        String string = "Работать нужно не 12 часов, а головой!";
        final char symbol = 'в';

        int charCounter = 0;
        for (char currentChar : string.toCharArray()) {
            if (currentChar == symbol) {
                charCounter++;
            }
        }
        System.out.println("Символ \"в\" встречается: " + charCounter + " раз/а");

        String testFirstWayString = "Работать нужно не 12 часов, а головой!";
        String[] splitArray = testFirstWayString.split("в");
        System.out.println("С помощью split символ \"в\" встречается: " + (splitArray.length - 1) + " раз/а.");

        String testSecondWayString = "Работать нужно не 12 часов, а головой";
        int occurrencesCount = testSecondWayString.length() -
                testSecondWayString.replace("в", "").length();
        System.out.println("С помощью replace символ \"в\" встречается: " + occurrencesCount + " раз/а.");

        String testThirdWayString = "Работать нужно не 12 часов, а головой";
        long count = testThirdWayString.chars().filter(element -> element == 'в').count();
        System.out.println("С помощью chars символ \"в\" встречается: " + count + " раз/а.");
    }
}