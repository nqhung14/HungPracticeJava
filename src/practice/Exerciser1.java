package practice;

import java.util.Scanner;

public class Exerciser1 {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        char search = 'a';
        int count = 0;

        for (int i=0; i<x.length();i++){
            if (x.charAt(i)==search){
                count++;
            }
        }
        System.out.println("Number of a is:"+count);
    }
}

