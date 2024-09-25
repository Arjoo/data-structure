import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character ch : str2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            if(e.getValue() != 0) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}