package Sortings;

public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < arr[high]) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
      if (low<high){
          int pivotIdx = partition(arr, low, high);

          quickSort(arr, low,pivotIdx-1);
          quickSort(arr,pivotIdx+1,high);
      }

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 8, 6, 1, 9, 2};
        System.out.println("Original array.");
        printArray(arr);
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);

        System.out.println("After quick sort.");
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
