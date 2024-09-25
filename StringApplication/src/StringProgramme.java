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
        return chars.toString();
    }
}