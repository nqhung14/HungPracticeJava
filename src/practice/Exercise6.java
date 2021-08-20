package practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int x = 12345;
        Scanner inputUserName = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println("Please enter pin:");
            int a = inputUserName.nextInt();
            if (x == a) {
                System.out.println("Correct, welcome back.");
                break;
            } else {
                System.out.println("Incorrect, try again.");
            }
        }

        System.out.println("Please enter pin:");
        int a = inputUserName.nextInt();
        if (x == a) {
            System.out.println("Correct, welcome back.");
        } else {
            System.out.println("Sorry but you have been locked out.");
        }

    }
}

