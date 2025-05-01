package Patterns;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        for (int i=0;i<v;i++){
            for (int j=0;j<h;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
