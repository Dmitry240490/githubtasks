package coding.replaceCharOfString_4;

// TODO: Задание. Заменить символ " * " в строке "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро."
//  на символ "а"
public class ReplaceChar {

    public static void main(String[] args) {
        String string = "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.";
        char oldChar = '*';
        char newChar = 'a';

        String s = replaceCharOfString(string, oldChar, newChar);
        System.out.println(s);
    }

    private static String replaceCharOfString(String string, char oldChar, char newChar) {
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (currentChar == oldChar) {
                chars[i] = newChar;
            }
        }
        return String.valueOf(chars);
    }
}