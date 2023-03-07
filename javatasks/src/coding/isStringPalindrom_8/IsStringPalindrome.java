package coding.isStringPalindrom_8;

// TODO: Задание. Написать метод который определяет является ли строка "Аргентина манит негра" палиндромом
public class IsStringPalindrome {

    public static void main(String[] args) {
        String string = "Аргентина манит негра";
        System.out.println(isStringPalindrome(string));
    }

    private static boolean isStringPalindrome(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        int leftCounter = 0;
        int rightCounter = chars.length - 1;
        while (leftCounter < rightCounter) {
            char leftChar = chars[leftCounter];
            char rightChar = chars[rightCounter];
            if (leftChar != rightChar) {
                return false;
            }
            leftCounter++;
            rightCounter--;
        }
        return true;
    }
}