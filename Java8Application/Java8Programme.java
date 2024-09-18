import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Programme {
    public static void main(String[] args) {
        // Find minimum number
        List<Integer> integers = Arrays.asList(10, 8, 9, 7, 4, 11, 3, 19, 30, 4);
        //IntStream intStream = IntStream.of(10, 8, 9, 7, 11, 3, 19, 30);
        Optional<Integer> min = integers.stream().min(Comparable::compareTo);
        min.ifPresent(System.out::println);

        //Remove duplicate
        List<Integer> unique = integers.stream().distinct().toList();
        System.out.println("Unique: "+ unique);

        //Ascending order
        List<Integer> increasing = integers.stream().sorted(Integer::compareTo).toList();
        System.out.println("Increasing: "+ increasing);

        //Descending order
        List<Integer> descending = integers.stream().sorted((n1, n2) -> n2.compareTo(n1)).toList();
        System.out.println("descending: "+ descending);

        // Find maximum number
        //intStream = IntStream.of(10, 8, 9, 7, 11, 3, 19, 30);
        Optional<Integer> max = integers.stream().max(Comparable::compareTo);
        max.ifPresent(System.out::println);

        // Another way to find max value
        Optional<Integer> maximumValue = integers.stream().reduce(Integer::max);
        maximumValue.ifPresent(System.out::println);

        //find sum using reduce()
        Integer sum = integers.stream().reduce(Integer::sum).get();
        System.out.println("Sum : "  +sum);

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

        //Merge two list
        List<Integer> even =Arrays.asList(2, 4);
        List<Integer> odd = Arrays.asList(1,3, 5);
        List<Integer> numbers = Stream.concat(even.stream(), odd.stream()).toList();
        System.out.println(numbers);


        Map<String, String> map = new HashMap<>();
        map.put("C", "30");
        map.put("B", "50");
        map.put("Z", "10");

        //Sort by keys
        List<Map.Entry<String, String>> entries = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList();
        System.out.println(entries);

        //Sort by keys
        List<Map.Entry<String, String>> sortByValues = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList();
        System.out.println(sortByValues);

    }
}
