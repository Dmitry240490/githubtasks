package coding.split_string_with_delimiter_7;

// TODO: Задание. Вывести строку "Работать нужно не 12 часов, а головой!" 3 раза с разделителем
public class StringSplitting {

    public static void main(String[] args) {
        String string = "Работать нужно не 12 часов, а головой!";
        StringBuilder stringBuilder = new StringBuilder();
        int n = 3;
        String delimiter = "\n";
        for (int i = 0; i < n; i++) {
            stringBuilder.append(string);
            if (i < n - 1) {
                stringBuilder.append(delimiter);
            }
        }
        System.out.println(stringBuilder);
    }
}