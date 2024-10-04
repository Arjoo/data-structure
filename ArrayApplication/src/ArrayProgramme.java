import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayProgramme {

    public boolean linearSearch(int[] arr, int elem) {
        for (int j : arr) {
            if (j == elem) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public boolean binarySearch(int[] arr, int start, int end, int elem) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == elem) {
                return Boolean.TRUE;
            } else if (arr[mid] > elem) {
                return binarySearch(arr, start, mid - 1, elem);
            } else {
                return binarySearch(arr, mid + 1, end, elem);
            }
        }
        return Boolean.FALSE;
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public int[] mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
        return arr;
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < n1)
            arr[k++] = left[i++];

        while (j < n2)
            arr[k++] = right[j++];

    }

    public int[] quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int partition = partition(arr, l, r);
            quickSort(arr, l, partition - 1);
            quickSort(arr, partition + 1, r);
        }
        return arr;
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    public int[] rotate(int[] arr, int k) {

        k = k > arr.length ? k - arr.length : k;
        int[] temp = new int[k];
        System.arraycopy(arr, 0, temp, 0, k);
        int j = 0;

        for (int i = k; i < arr.length; i++, j++) {
            arr[j] = arr[i];
        }
        for (int i = 0; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
        return arr;
    }

    public int[] reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (largest < i) {
                largest = i;
            }
        }
        return largest;
    }

    public int[] moveAllZerosAtEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        return arr;
    }

    public List<Integer> leaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int l = arr[arr.length - 1];
        leaders.add(l);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > l) {
                l = arr[i];
                leaders.add(l);
            }
        }
        return leaders;
    }

    public int[] arrangeNegativePositive(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        return arr;
    }

    public int[] swapZeroOneTwo(int[] arr) {
        int l = 0, m = 0, h = arr.length - 1;
        while (m <= h) {
            switch (arr[m]) {
                case 0 -> {
                    swap(arr, l, m);
                    l++;
                    m++;
                }
                case 1 -> m++;
                case 2 -> {
                    swap(arr, m, h);
                    h--;
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] merge(int[] a, int[] b) {
        int[] merge = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                merge[k++] = a[i++];
            else
                merge[k++] = b[j++];
        }

        while (i < a.length)
            merge[k++] = a[i++];

        while (j < b.length)
            merge[k++] = b[j++];

        return merge;
    }

    //Moore Algorithm
    public int majorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;
        for (int i : arr) {
            if (count == 0) {
                candidate = i;
                count++;
            } else if (i == candidate)
                count++;
            else
                count--;
        }

        count = 0;
        for (int i : arr) {
            if (i == candidate)
                count++;
        }
        return count > arr.length / 2 ? candidate : -1;
    }

    public int findMissingNUmber(int[] arr, int n) {
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int i : arr) {
            sum2 += i;
        }
        return sum1 - sum2;
    }

    public List<Map.Entry<Integer, Long>> findDuplicates(int[] arr) {
        return Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .toList();
    }

    public int findFirstRepeated(int[] arr) {
        Map.Entry<Integer, Long> firstRepeated = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .findFirst()
                .get();
        return firstRepeated.getKey();
    }

    public int secondHighest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int value : arr) {
            if (first < value) {
                first = value;
            }
        }

        for (int value : arr) {
            if (second < value && value != first) {
                second = value;
            }
        }
        return second;
    }

    public int secondHighestUsingHeap(int[] arr, int kthLargest) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(kthLargest);
        int i = 0;
        for (; i < kthLargest; i++) {
            queue.add(arr[i]);
        }

        for (; i < arr.length; i++) {
            if (queue.size() == kthLargest && queue.peek() < arr[i]) {
                queue.poll();
                queue.add(arr[i]);
            }
        }
        return queue.poll();
    }


    public int reverseNumber(int number) {
        int value = number > 0 ? number : -number;
        StringBuilder response = new StringBuilder();
        for (int remainder = value % 10; remainder > 0; remainder = value % 10) {
            response.append(remainder);
            value = value / 10;
        }
        return number > 0
                ? Integer.parseInt(response.toString())
                : -Integer.parseInt(response.toString());
    }


    public List<Integer> findPrimeNumbers(int number) {
        List<Integer> primes = new ArrayList<>();
        for(int i=2; i<number; i++) {
            boolean isPrime = isPrime(i);
            if(isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }

    private boolean isPrime(int number) {
        int sqrt = (int)Math.sqrt(number);
        for(int i=2; i<=sqrt; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
