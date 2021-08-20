package practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        String[] User = {"Hassan", "Idris", "Trevor"};
        String[] Pass = {"homecomingking", "turnupcharlie","afraidofthedark"};

        System.out.println("Enter user name:");
        Scanner inputUserName = new Scanner(System.in);
        String a = inputUserName.next();

        System.out.println("Enter password:");
        Scanner inputPassWord = new Scanner(System.in);
        String b = inputPassWord.next();

        for (int i = 0; i < User.length; i++) {

            if (a.equals(User[i]) && b.equals(Pass[i])) {
                System.out.println("Hello " + User[i]);
            } else {
                System.out.println("Incorrect Login");
            }
        }
    }
}
