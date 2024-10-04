import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProgramme {

    public String firstRepeated(String str) {
        Map.Entry<String, Long> findFirst = Arrays.stream(str.split(""))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), LinkedHashMap::new, Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst().get();

        return findFirst.getKey();
    }

    public String reverse(String str) {
        char[] chars = str.toCharArray();
        for(int i=0, j=chars.length-1 ; i<j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return String.valueOf(chars);
    }


    public boolean anagram(String str1, String str2) {
        if(str1 == null || str2 == null) {
            return Boolean.FALSE;
        }

        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : str1.toLowerCase().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character ch : str2.toLowerCase().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            if(e.getValue() != 0) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }

    public String removeDuplicate(String str) {
        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    }

    public String reverseWordInSentence(String str) {
        String output = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                temp = ch + temp;
            } else {
                output += temp + ch;
                temp = "";
            }
        }
        output += temp;
        return output;
    }

    public boolean isPalindrome(String str) {
        for(int i=0, j=str.length()-1; i<j; i++, j--) {
            if(str.charAt(i) != str.charAt(j)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public Map<Character, Integer> countChars(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public Map<String, Long> countCharsJava8(String str) {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}