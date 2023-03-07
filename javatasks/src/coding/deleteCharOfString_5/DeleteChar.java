package coding.deleteCharOfString_5;

// TODO: Задание. Удалить символ "!" в строке "Работать нужно не 12 часов, а головой!"
public class DeleteChar {

    public static void main(String[] args) {
        String string = "Работать нужно не 12 часов, а головой!";
        char charToRemove = '!';
        String newString = removeChar(string, charToRemove);
        System.out.println(newString);
    }

    private static String removeChar(String string, char charToRemove) {
        char[] chars = string.toCharArray();
        char[] workSpace = new char[chars.length];
        int workSpaceIndexCounter = 0;
        for (char currentChar : chars) {
            if (currentChar != charToRemove) {
                workSpace[workSpaceIndexCounter] = currentChar;
                workSpaceIndexCounter++;
            }
            System.out.println(new String(workSpace) + ", current char = " + currentChar);
        }
        return new String(workSpace, 0, workSpaceIndexCounter);
    }
}