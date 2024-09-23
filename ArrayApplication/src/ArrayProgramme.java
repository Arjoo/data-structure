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
        if(start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == elem)
                return Boolean.TRUE;
            else if (arr[mid] > elem)
                return binarySearch(arr, start, mid - 1, elem);
            else
                return binarySearch(arr, mid + 1, end, elem);
        }
        return Boolean.FALSE;
    }

    //{1, 3, 5, 9, 7}
    public int[] bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j< arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        for(int i=1; i< arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

}
