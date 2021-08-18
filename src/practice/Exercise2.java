package practice;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Enter height:");
        Scanner inputHeight = new Scanner(System.in);
        int x = inputHeight.nextInt();

        System.out.println("Enter width:");
        Scanner inputWidth = new Scanner(System.in);
        int y = inputWidth.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j < y) {
                    System.out.print("#");
                }
            }
            System.out.println( );
        }
    }
}

