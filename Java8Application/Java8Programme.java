import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Programme {
    public static void main(String[] args) {
        // Find minimum number
        IntStream intStream = IntStream.of(10, 8, 9, 7, 11, 3, 19, 30);
        OptionalInt min = intStream.min();
        if(min.isPresent())
            System.out.println(min.getAsInt());

        // Find maximum number
        intStream = IntStream.of(10, 8, 9, 7, 11, 3, 19, 30);
        OptionalInt max = intStream.max();
        if(max.isPresent())
            System.out.println(max.getAsInt());

        //Find String of a particular length
        int length = 6;
        List<String> list = Arrays.asList("Arjoo", "Rajesh", "Mahesh", "Jack", "Arjoo", "Fedrick");
        List<String> strings = list.stream().filter(l -> l.length() == length).toList();
        System.out.println(strings);

        //Count number of string of a particular length
        long count = list.stream().filter(l -> l.length() == length).count();
        System.out.println(count);

        // Count number of each string
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


    }
}
