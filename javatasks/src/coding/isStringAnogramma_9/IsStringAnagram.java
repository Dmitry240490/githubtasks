package coding.isStringAnogramma_9;

// TODO: Задание. Написать метод который определяет является ли слово анаграммой (обезьянство, место, мечеть)
public class IsStringAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("обезьянство", "оветьянсзбо"));
        System.out.println(isAnagram("место", "тесмо"));
        System.out.println(isAnagram("мечеть", "чеметь"));
    }

    private static boolean isAnagram(String origin, String anagram) {
        if (origin.length() != anagram.length()) {
            return false;
        }

        char[] originalChars = origin.toCharArray();
        char[] anagramChars = anagram.toCharArray();
        boolean[] markers = new boolean[anagramChars.length];

        for (char currentChar : originalChars) {
            for (int j = 0; j < anagramChars.length; j++) {
                if (currentChar == anagramChars[j]) {
                    if (!markers[j]) {
                        markers[j] = true;
                        break;
                    }
                }
                if (j == anagramChars.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}