package Sortings;

public class MergeSort {

    public static void conquer(int[] arr, int si, int midi, int ei) {
        int[] merger = new int[ei - si + 1];

        int si1 = si;
        int si2 = midi + 1;
        int idx = 0;

        while (si1 <= midi && si2 <= ei) {
            if (arr[si1] <= arr[si2]) {
                merger[idx++] = arr[si1++];
            } else merger[idx++] = arr[si2++];
        }

        while (si1 <= midi) {
            merger[idx++] = arr[si1++];
        }

        while (si2 <= ei) {
            merger[idx++] = arr[si2++];
        }
        System.out.println("merging array");
        printArray(merger);
//        System.out.println("arr during conquer");
//        printArray(arr);

        for (int i = 0; i < merger.length; i++) {
            arr[si+i] = merger[i];
        }
    }


    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int midi = si + (ei - si) / 2;

        divide(arr, si, midi);
        divide(arr, midi + 1, ei);
        conquer(arr, si, midi, ei);
    }

    public static void mergeSort(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;

        divide(arr, si, ei);

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 7, 4, 1, 9, 2};
        System.out.println("Original array.");
        printArray(arr);

        mergeSort(arr);
        System.out.println("MergedSorted array");
        printArray(arr);
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
