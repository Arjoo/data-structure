import java.util.Arrays;
import java.util.List;
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
        boolean binary = arrayProgramme.binarySearch(new int[]{1, 3, 5, 7, 9} , 0, 4, 9);
        System.out.println(binary);

        //*************
        // Bubble Sort
        //*************
        int[] arr = new int[]{1, 3, 5, 9, 7};
        arr = arrayProgramme.bubbleSort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e +", "));
        System.out.println();

        arr = new int[]{1, 0, 5, 9, -1};
        arr = arrayProgramme.bubbleSort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e +", "));
        System.out.println();
        //*************
        // Insertion Sort
        //*************
        arr = new int[]{1, 0, 5, 9, -1};
        arr = arrayProgramme.insertionSort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e +", "));
        System.out.println();

        //*************
        // Merge Sort
        //*************
        arr = new int[]{1, 0, 5, 9, -1, 10, 3, 4};
        arr = arrayProgramme.mergeSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(e -> System.out.print(e +", "));
        System.out.println();
    }
}
