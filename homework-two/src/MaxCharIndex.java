import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxCharIndex {
    public static void main(String[] args) {
        System.out.println(maxCharIndex("Опытный копирайтер знает, сколько времени у него уходит на написание килознака, поэтому может легко рассчитать, целесообразно ли ему браться за конкретный заказ. Новичку сложнее: он-то наверняка привык мерить текст страницами, как учат в плохих университетах. Эта статья поможет начинающему копирайтеру сделать вывод: много это или мало – 1000 знаков?"));
    }

    public static int maxCharIndex(String string) {
        if (string == null || string.isBlank()) {
            return -1;
        }
        //Написать данный метод стримАпи в новом методе
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char aChar: string.toCharArray()){
            if (hashMap.containsKey(aChar)) {
                hashMap.put(aChar, hashMap.get(aChar)+1);
            } else {
                hashMap.put(aChar, 1);
            }
        }

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

