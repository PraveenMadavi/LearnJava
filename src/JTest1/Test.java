package JTest1;

import java.util.Arrays;

public class Test {

    public static void update(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        arr =new int[6];
        arr[3]=19;
        arr[4]=10;
        arr[5]=9;

        System.out.println("after sort.");
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 8;
        arr[1] = 23;
        arr[2] = 5;
        update(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
