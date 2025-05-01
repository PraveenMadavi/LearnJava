package Searching;

public class BinarySearch {

    public static int searchBinary( int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
           int mid= start+(end-start)/2;
            if (target==arr[mid])return mid;
            else if (target < arr[mid]) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 1;

        int result = searchBinary(arr,target);

        if (result== -1) System.out.println("Number not found !");
        else System.out.println("Number found at index[${}]"+ result);


    }
}
