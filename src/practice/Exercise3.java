package practice;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter integer:");
            Scanner inputInteger = new Scanner(System.in);
            int a = inputInteger.nextInt();
            sum = sum + a;
        }
        System.out.print("Total is:" + sum);
    }
}
