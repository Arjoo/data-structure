import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;

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
    }
}
