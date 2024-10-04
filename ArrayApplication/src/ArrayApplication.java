import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ArrayApplication {
    public static void main(String[] args) {

        ArrayProgramme arrayProgramme = new ArrayProgramme();
        //*************
        // Linear Search
        //*************
        boolean linearFind = arrayProgramme.linearSearch(new int[]{1, 3, 7, 5, 9}, 3);
        System.out.println(linearFind);

        //*************
        // Binary Search
        //*************
        boolean binary = arrayProgramme.binarySearch(new int[]{1, 3, 5, 7, 9}, 0, 4, 9);
        System.out.println(binary);

        //*************
        // Bubble Sort
        //*************
        int[] arr = new int[]{1, 3, 5, 9, 7};
        arr = arrayProgramme.bubbleSort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        arr = new int[]{1, 0, 5, 9, -1};
        arr = arrayProgramme.bubbleSort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();
        //*************
        // Insertion Sort
        //*************
        arr = new int[]{1, 0, 5, 9, -1};
        arr = arrayProgramme.insertionSort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Merge Sort
        //*************
        arr = new int[]{1, 0, 5, 9, -1, 10, 3, 4};
        arr = arrayProgramme.mergeSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Quick Sort
        //*************
        arr = new int[]{1, 0, 5, 9, -1, 10, 3, 4, 7};
        arr = arrayProgramme.quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Rotate an array
        //*************
        arr = arrayProgramme.rotate(arr, 2);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        arr = new int[]{1, 0, 5, 9, -1, 10, 3, 4, 7};
        arr = arrayProgramme.rotate(arr, 11);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Reverse an array
        //*************
        arr = new int[]{1, 2, 3, 4};
        arr = arrayProgramme.reverse(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Find largest value in the array
        //*************
        arr = new int[]{1, 0, 5, 9, -1, 10, 3, 4, 7};
        int largest = arrayProgramme.largest(arr);
        System.out.println("largest value is : " + largest);

        arr = new int[]{1, 0, 5, 9, -1, 10, 3, 4, 7, 20};
        largest = arrayProgramme.largest(arr);
        System.out.println("largest value is : " + largest);

        //*************
        // Reverse an array
        //*************
        arr = new int[]{0, 2, 0, 3, 0, 4};
        arr = arrayProgramme.moveAllZerosAtEnd(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        arr = new int[]{1, 5, 9, 0, 2, 0, 3, 0, 4};
        arr = arrayProgramme.moveAllZerosAtEnd(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Find leaders
        //*************
        arr = new int[]{16, 17, 4, 3, 5, 2};
        List<Integer> leaders = arrayProgramme.leaders(arr);
        leaders.stream().sorted(Collections.reverseOrder()).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Reverse an array
        //*************
        arr = new int[]{-1, 2, 5, -3, -8, 4};
        arr = arrayProgramme.arrangeNegativePositive(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Swap zero, one and two
        //*************
        arr = new int[]{0, 1, 2, 0, 1, 2};
        arr = arrayProgramme.swapZeroOneTwo(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        arr = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        arr = arrayProgramme.swapZeroOneTwo(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Merge two sorted arrays
        //*************
        arr = arrayProgramme.merge(new int[]{1, 2, 3}, new int[]{7, 8, 9});
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        arr = arrayProgramme.merge(new int[]{1, 2, 3, 20}, new int[]{7, 8, 9, 50});
        Arrays.stream(arr).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //*************
        // Majority Element
        //*************
        int majorityElement = arrayProgramme.majorityElement(new int[]{1, 2, 3});
        System.out.println("majorityElement  : " + majorityElement );

        majorityElement = arrayProgramme.majorityElement(new int[]{1, 1, 2, 1, 3, 5, 1});
        System.out.println("majorityElement  : " + majorityElement );

        majorityElement = arrayProgramme.majorityElement(new int[]{3, 3, 4, 2, 4, 4, 2, 4});
        System.out.println("majorityElement  : " + majorityElement );

        majorityElement = arrayProgramme.majorityElement(new int[]{3});
        System.out.println("majorityElement  : " + majorityElement );

        //*************
        // Missing number
        //*************
        int missingNumber = arrayProgramme.findMissingNUmber(new int[]{1, 2, 4, 6, 3, 7, 8}, 8);
        System.out.println("missingNUmber  : " + missingNumber );

        missingNumber = arrayProgramme.findMissingNUmber(new int[]{1, 2, 3, 5}, 5);
        System.out.println("missingNUmber  : " + missingNumber );

        //*************
        // Find Duplicates
        //*************
        List<Map.Entry<Integer, Long>> findDuplicates = arrayProgramme.findDuplicates(new int[]{1, 2, 3, 6, 3, 6, 1});
        findDuplicates.forEach(e -> System.out.print(e.getKey() + ", "));
        System.out.println();

        findDuplicates = arrayProgramme.findDuplicates(new int[]{1, 2, 3, 4 ,3});
        findDuplicates.forEach(e -> System.out.print(e.getKey() + ", "));
        System.out.println();

        //*************
        // Find first repeated
        //*************
        int firstRepeated = arrayProgramme.findFirstRepeated(new int[]{1, 3, 1,2, 3, 6, 3, 6, 1});
        System.out.println("firstRepeated : " + firstRepeated);

        firstRepeated = arrayProgramme.findFirstRepeated(new int[]{6, 1, 3,2, 3, 6, 3, 6, 1});
        System.out.println("firstRepeated : " + firstRepeated);

        firstRepeated = arrayProgramme.findFirstRepeated(new int[]{2, 1, 4, 3, 4, 3, 6, 1});
        System.out.println("firstRepeated : " + firstRepeated);

        //*************
        // fina second highest
        //*************
        int secondHighest = arrayProgramme.secondHighest(new int[]{2, 10, 4, 3, 6, 1});
        System.out.println("secondHighest: " + secondHighest);

        secondHighest = arrayProgramme.secondHighest(new int[]{2, 10, 4, 3, 6, 1, 11});
        System.out.println("secondHighest: " + secondHighest);

        secondHighest = arrayProgramme.secondHighestUsingHeap(new int[]{2, 10, 4, 3, 6, 1, 11}, 2);
        System.out.println("secondHighest: " + secondHighest);

        secondHighest = arrayProgramme.secondHighestUsingHeap(new int[]{2, 10, 4, 3, 6, 1, 11, 12}, 2);
        System.out.println("secondHighest: " + secondHighest);

        secondHighest = arrayProgramme.secondHighestUsingHeap(new int[]{2, 10, 4, 3, 6, 1, 11, 12}, 3);
        System.out.println("secondHighest: " + secondHighest);


        //*************
        // Reverse integer value
        //*************
        int reverseNumber = arrayProgramme.reverseNumber(12345);
        System.out.println("reverseNumber : " + reverseNumber);

        reverseNumber = arrayProgramme.reverseNumber(-12345);
        System.out.println("reverseNumber : " + reverseNumber);

        //*************
        // Find prime numbers
        //*************
        List<Integer> primeNumbers = arrayProgramme.findPrimeNumbers(10);
        System.out.println("primeNumbers : " + primeNumbers);

        //*************
        // Find Max value
        //*************
        int max = arrayProgramme.max(new int[]{2, 4, 9, 1, 0, 19});
        System.out.println("max : " + max);
    }
}
