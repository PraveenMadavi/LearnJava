package Sortings;
//import java.util.Arrays;  //while learning you cant use util classes.

public class Sort {

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                int tempNumber;
                if (arr[j]>arr[j+1]) {
                    tempNumber = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tempNumber;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //find minNumber
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){
        for (int i= 1 ; i < arr.length; i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,8,11,2,3,53,9,6,4};

        System.out.println("By using Bubble sort.");
        printArray(bubbleSort(arr));

        System.out.println("By using selection sort.");
        printArray(selectionSort(arr));

        System.out.println("By using insertion sort.");
        printArray(insertionSort(arr));


    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
