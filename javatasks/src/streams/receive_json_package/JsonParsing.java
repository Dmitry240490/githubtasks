package streams.receive_json_package;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: Задание. На вход получаем некий JSON. Проверить, что поле "isPopular" равно false
public class JsonParsing {

    public static void main(String[] args) throws IOException {
        byte[] fileBytes = Files.readAllBytes(Path.of("C:\\Users\\Asus\\githubdifferent\\задания\\" +
                "githubtask_for_alfabank\\alfa\\src\\stream_api\\receive_json_package\\text.json"));
        String json = new String(fileBytes);
        System.out.println(json);

        Pattern pattern = Pattern.compile("\"(isPopular)\": (true|false)");
        Matcher matcher = pattern.matcher(json);
        if (matcher.find()) {
            String fieldName = matcher.group(1);
            boolean fieldValue = Boolean.parseBoolean(matcher.group(2));
            System.out.println(fieldName + "=" + fieldValue);
        }
    }
}