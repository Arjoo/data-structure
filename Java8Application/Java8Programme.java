import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
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
        System.out.println("Unique: " + unique);

        //Ascending order
        List<Integer> increasing = integers.stream().sorted(Integer::compareTo).toList();
        System.out.println("Increasing: " + increasing);

        //Descending order
        List<Integer> descending = integers.stream().sorted((n1, n2) -> n2.compareTo(n1)).toList();
        System.out.println("descending: " + descending);

        // Find maximum number
        //intStream = IntStream.of(10, 8, 9, 7, 11, 3, 19, 30);
        Optional<Integer> max = integers.stream().max(Comparable::compareTo);
        max.ifPresent(System.out::println);

        // Another way to find max value
        Optional<Integer> maximumValue = integers.stream().reduce(Integer::max);
        maximumValue.ifPresent(System.out::println);

        //find sum using reduce()
        Integer sum = integers.stream().reduce(Integer::sum).get();
        System.out.println("Sum : " + sum);

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
        List<Integer> even = Arrays.asList(2, 4);
        List<Integer> odd = Arrays.asList(1, 3, 5);
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

        //merge key- values
        String merge = map.merge("C", "Merge", (k1, k2) -> k1 + " " + k2);
        System.out.println(merge);

        List<Book> books = Arrays.asList(
                new Book(1, "Java", 100),
                new Book(2, "Go lang", 20),
                new Book(3, "C", 50),
                new Book(4, "Python", 10),
                new Book(1, "Python", 100),
                new Book(2, "Go lang", 30));

        // category wise price
        Map<Integer, Integer> sumByCategory = books.stream().collect(Collectors.groupingBy(Book::getId, Collectors.summingInt(Book::getPrice)));
        System.out.println(sumByCategory);

        // length of book names
        Map<String, Integer> nameLength = books.stream().map(Book::getName).collect(Collectors.toMap(Function.identity(), String::length, (k1, k2) -> k1));
        System.out.println(nameLength);

        //find name occurrences
        Map<String, Long> occurrences = books.stream().map(Book::getName).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrences);

        //book name list
        List<String> bookNames = books.stream().map(Book::getName).toList();
        System.out.println(bookNames);

        //Unique book name list
        List<String> uniqueBookNames = books.stream().map(Book::getName).distinct().toList();
        System.out.println(uniqueBookNames);

        //Join all book names
        String joinedBookName = books.stream().map(Book::getName).collect(Collectors.joining(", "));
        System.out.println(joinedBookName);

        //Count number of books
        long numberOfBooks = books.stream().count();
        System.out.println(numberOfBooks);

        //Sort book by name
        List<String> sortByName = books.stream().map(Book::getName).sorted(String::compareTo).toList();
        System.out.println(sortByName);

        //Sort book by name in reverse order
        List<String> sortByNameInReverseOrder = books.stream().map(Book::getName).sorted(Collections.reverseOrder()).toList();
        System.out.println(sortByNameInReverseOrder);

        //Name in upper case
        List<String> upperCase = books.stream().map(Book::getName).map(String::toUpperCase).toList();
        System.out.println(upperCase);


        // find even length book name
        List<String> evenLengthBookNames = books.stream().map(Book::getName).filter(b -> b.length() % 2 == 0).toList();
        System.out.println(evenLengthBookNames);

        //Find books start with P
        List<String> startWithP = books.stream().map(Book::getName).filter(b -> b.startsWith("P")).toList();
        System.out.println(startWithP);


        List<User> users = Arrays.asList(
                new User(1, "Arjoo", 100),
                new User(2, "Michel", 100),
                new User(3, "Pawan", 50),
                new User(4, "Ajay", 50),
                new User(3, "Apple", 20),
                new User(3, "Banana", 50)

        );

        //find total salary
        long totalSalary = users.stream().map(User::getSalary).reduce(Integer::sum).get();
        System.out.println(totalSalary);

        //sum of salary based on dept
        Map<Integer, Integer> deptWiseSalary = users.stream().collect(Collectors.groupingBy(User::getDeptId, Collectors.summingInt(User::getSalary)));
        System.out.println(deptWiseSalary);

        //dept wise employee
        Map<Integer, List<User>> deptWiseEmp = users.stream().collect(Collectors.groupingBy(User::getDeptId, Collectors.toList()));
        System.out.println(deptWiseEmp);

        // Join employee
        String emp = users.stream().map(User::getName).collect(Collectors.joining("-"));
        System.out.println(emp);

        //count employee
        long empCount = users.stream().count();
        System.out.println(empCount);

        //Sort emp by name
        List<String> sortedEmp = users.stream().map(User::getName).sorted(String::compareTo).toList();
        System.out.println(sortedEmp);

        //Sort emp by name in reverse order
        List<String> sortedEmpReverse = users.stream().map(User::getName).sorted(Collections.reverseOrder()).toList();
        System.out.println(sortedEmpReverse);

        // Uppercase name
        List<String> upperCaseName = users.stream().map(User::getName).map(String::toUpperCase).toList();
        System.out.println(upperCaseName);


        //New employee collection
        List<Employee> employees = EmployeeCollection.employees();

        // find the count of male and female staff
        Map<String, Long> groupByGender = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(groupByGender);

        // List all male and female staff
        Map<String, List<Employee>> groupAndListGender = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.toList()));
        System.out.println(groupAndListGender);

        //find all department name
        List<String> deptName = employees.stream().map(Employee::getDepartment).distinct().toList();
        System.out.println(deptName);

        //Gender wise average age
        Map<String, Double> averageAge = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAge);

        //find max salary
        Optional<Employee> maxSal = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        maxSal.ifPresent(System.out::println);

        //find minimum sal
        Optional<Employee> minSal = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        minSal.ifPresent(System.out::println);


        //dept wise staff
        Map<String, Long> depWiseNumberOfStaff = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(depWiseNumberOfStaff);

        // Average sal of each dept
        Map<String, Double> depWiseAverageSal = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(depWiseAverageSal);

        // Youngest Female emp from HR dept
        String gender = "Female";
        String dept = "HR";
        Optional<Employee> youngerStaff = employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(dept))
                .filter(e -> e.getGender().equalsIgnoreCase(gender))
                .min(Comparator.comparing(Employee::getAge));

        youngerStaff.ifPresent(System.out::println);

        // find youngest in all dept
        Optional<Employee> youngestAge = employees.stream().min(Comparator.comparing(Employee::getAge));
        youngestAge.ifPresent(System.out::println);


        Map<String, Integer> keyValue = new HashMap<>();
        keyValue.put("A", 10);
        keyValue.put("B", 4);
        keyValue.put("D", 3);
        keyValue.put("C", 9);

        // Sort by value using java 7 syntax
        Set<Map.Entry<String, Integer>> entrySet = keyValue.entrySet();
        List<Map.Entry<String, Integer>> keyValuesList = new ArrayList<>(entrySet);
        keyValuesList.sort((e1, e2) -> {
            if(Objects.equals(e1.getValue(), e2.getValue()))
                return 0;
            return e2.getValue().compareTo(e1.getValue());
        });

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> e :keyValuesList) {
            linkedHashMap.put(e.getKey(), e.getValue());
        }
        System.out.println(linkedHashMap);

        //Sort by value java 8 syntax using inbuilt method
        keyValue.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


        //Sort by value java 8 syntax using comparator
        keyValue.entrySet().stream().sorted((e1, e2) -> {
            if(Objects.equals(e1.getValue(), e2.getValue()))
                return 0;
            return e2.getValue().compareTo(e1.getValue());
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k1, k2) -> k1, LinkedHashMap::new))
                .forEach((k,v)-> System.out.println(k+"="+v));

        System.out.println("-----------------");
        //find First non-repeated
        String str = "indian";
        Map.Entry<Character, Long> characterLongEntry = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L).findFirst().get();
        System.out.println(characterLongEntry);


        //Check palindrome
        str = "madam";
        List<String> l = Arrays.asList(str.split(""));
        System.out.println(l);


    }
}
