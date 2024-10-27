import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMaxCharIndex {
    public static void main(String[] args) {
        System.out.println(streamMaxCharIndex("Опытный копирайтер знает, сколько времени у него уходит на написание килознака, поэтому может легко рассчитать, целесообразно ли ему браться за конкретный заказ. Новичку сложнее: он-то наверняка привык мерить текст страницами, как учат в плохих университетах. Эта статья поможет начинающему копирайтеру сделать вывод: много это или мало – 1000 знаков?"));
    }

    public static int streamMaxCharIndex(String string) {
        if (string == null || string.isBlank()) {
            return -1;
        }
// 3       String[] split = string.split("");//нарезали строку по одному символу
        Map<String, Long> collect = Arrays.stream(string.split("")).collect(Collectors.groupingBy(str -> str, Collectors.counting()));

//        char[] chars = string.toCharArray();
// 2       HashMap<Character, Integer> hashMap = new HashMap<>();
// 2      string.chars().forEach(character -> hashMap.merge((char) character, 1, (a, b) -> a + b));
//        Stream<Character> characterStream = IntStream.range(0, chars.length).mapToObj(i -> chars[i]);
//        characterStream.map(t -> t.charValue()).collect(Collectors.toSet());
//        for (int i = 0; i < chars.length; i++) {
//            if (hashMap.containsKey(chars[i])) {
//                hashMap.put(chars[i], hashMap.get(chars[i]) + 1);
//            } else {
//                hashMap.put(chars[i], 1);
//            }
//        }

        Character character = null;
        Integer maxRepeat = 0;
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (maxRepeat < entry.getValue()) {
                maxRepeat = entry.getValue();
                character = entry.getKey();
            }
        }
        return string.indexOf(character);
    }
}
