package practice;

import java.util.Scanner;

class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner inputInteger = new Scanner(System.in);
        int a = inputInteger.nextInt();
        int b = 1;
        for (int i = 0; i < a; i++) {
            int x = a - i;
            b = x * b;
        }
            System.out.println("Factorial of the number is:" + b);
    }
}
