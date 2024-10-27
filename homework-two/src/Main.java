
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        printStringReverse("Апельсин");
        printStringReverse("Cмородина");
        printStringReverse(null);
        printStringReverse(" ");
        printSubStringReverse("Hello world!", 9, 6);

        System.out.println("Проверка телефона: " + isPhoneNumber("81234567890"));
        getWordsReverse(null);
        getWordsReverse(" ");
        getWordsReverse("Hello my nice world");
        maxCharIndex("ddcccabbbb");


    }

    public static void printStringReverse(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
        } else {
            StringBuilder stringBuilder = new StringBuilder(string);
            System.out.println(stringBuilder.reverse());
        }
    }

    public static Boolean isPhoneNumber(String string) {
        if (string == null) {
            return null;
        }
        return string.matches("^8\\d{10}");
    }

    public static void printSubStringReverse(String string, int start, int finish) {
        if (string == null || string.isEmpty()
                || start < 0 || finish < 0
                || start > finish
                || start > string.length()
                || finish > string.length()
        ) {
            System.out.println("Wrong args");
        } else {
            StringBuilder startBuilder = new StringBuilder(string.substring(0, start));
            StringBuilder builderRev = new StringBuilder(string.substring(start, finish)).reverse();
            StringBuilder finishBuilder = new StringBuilder(string.substring(finish));
            System.out.println(startBuilder.toString() + builderRev + finishBuilder);
        }
    }

    public static void getWordsReverse(String string) {
        System.out.print("getWordsReverse " + string + ": ");
        if (string == null || string.isBlank()) {
            System.out.println("Wrong string");
        } else {
            String[] strings = string.split(" ");
            for (String words : strings) {
                StringBuilder builder = new StringBuilder(words);
                System.out.println(builder.reverse());
            }
        }
    }

    public static int maxCharIndex(String string) {
        if (string == null || string.isBlank()) {
            System.out.println("-1");
        } else {
            char[] chars = new char[string.length()];
            string.getChars(0, string.length(), chars, 0);
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < chars.length; i++) {
                if (map.containsKey(chars[i])) {
                    map.put(chars[i], map.get(chars[i]++));
                } else {
                    map.put(chars[i], 1);
                }
            }

            Character value = null;
            int volume = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (volume < entry.getValue()) {
                    volume = entry.getValue();
                    value = entry.getKey();
                }
            }

            for (int i = 0; i < string.length(); i++) {
                if (value == chars[i]) {
                    System.out.println(i);
                }
//                System.out.println(string.indexOf(value));
            }
        }
        return string.indexOf(string);
    }
}

//        return "vddcccabbbb".indexOf('a');
//    String expectStr = "ddctccabbtktobttb";
//        if(expectStr ==null||expectStr.isBlank())
//
//    {
//        System.out.println("-1");
//    } else
//
//    {
//        char[] chars = new char[expectStr.length()];
//        expectStr.getChars(0, expectStr.length(), chars, 0);
//
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < chars.length; i++) {
//            if (map.containsKey(chars[i])) {
//                map.put(chars[i], map.get(chars[i]) + 1);
//            } else {
//                map.put(chars[i], 1);
//            }
//        }
//
//        Character value = null;
//        int volume = 0;
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (volume < entry.getValue()) {
//                volume = entry.getValue();
//                value = entry.getKey();
//            }
//        }
//
//        // мы тут
//        for (int i = 0; i < expectStr.length(); i++) {
//            if (value == chars[i]) {
//                System.out.println(i);
//                return;
//            }
//        }
//        // or
//        System.out.println(expectStr.indexOf(value));
//    }
//}

