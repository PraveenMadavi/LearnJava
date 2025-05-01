package JTest1;

public class ClosestToZero {

    public static void sumOfNumbsToClosestZero(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Length of array should be at least two;");
            return;
        }
        int sum = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int absSum = Math.abs(arr[i] + arr[j]);
                if (absSum < sum) {
                    sum = absSum;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println(num1);
        System.out.println(num2);

    }

    public static void main(String[] args) {
//        int[] arr ={-1,2,4,-3,6,7};
//        int[] arr = {1, 60, -10, 70, -80, 85};
//        int[] arr = {10, -3, 4, -2, -1, 5};
//        int[] arr = {-3};
        int[] arr = {-7, -4, -2, 3, 6, 8};

//        System.out.println(arr.length);
        sumOfNumbsToClosestZero(arr);
    }
}
