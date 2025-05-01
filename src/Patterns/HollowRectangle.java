package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();

        for (int i = 1;i<=v; i++ ){
            for (int j=1; j<=h; j++){
                if (i==1 || i==v || j==1 || j==h) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }


//how i code it but it is not that good
//        for (int i = 0; i < v; i++) {
//            for (int j = 0; j < h; j++) {
//                if (i==0 || i==v-1) System.out.print("* ");
//                else if (j==0 || j==h-1) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
    }
}
