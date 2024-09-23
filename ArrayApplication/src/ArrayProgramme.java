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
            if (arr[mid] == elem)
                return Boolean.TRUE;
            else if (arr[mid] > elem)
                return binarySearch(arr, start, mid - 1, elem);
            else
                return binarySearch(arr, mid + 1, end, elem);
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
        if(l<r) {
            int mid = (l + r) /2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid +1, r);
            merge(arr, l, mid, r);
        }
        return arr;
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid -l + 1;
        int n2 = r -mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0; i<n1; i++) {
            left[i] = arr[l +i];
        }

        for(int i=0; i<n2; i++) {
            right[i] = arr[mid + 1 +i];
        }

        int i=0, j=0, k=l;
        while (i<n1 && j<n2) {
            if(left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i<n1)
            arr[k++] = left[i++];

        while (j<n2)
            arr[k++] = right[j++];

    }

    public int[] quickSort(int[] arr, int l, int r) {

        return arr;
    }
}
