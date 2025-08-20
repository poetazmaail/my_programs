package oop.practice;
import java.util.*;
import java.io.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int orig, rev = 0, sum = 0;
        orig = number;

        for(;number > 0;){
            int digit = number % 10;
            sum += digit;
            rev = rev * 10 + digit;
            number = number / 10;

        }

    String display = orig == rev ? "Palindrome":"Not Palindrome";
    System.out.println(display);
    }
}
