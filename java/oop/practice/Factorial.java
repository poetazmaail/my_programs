package oop.practice;
// factorial of a number using recursion.

public class Factorial {
     int fact(int number){
        if (number == 1){
            return 1;
        } else {
            return number*fact(number-1);
        }
    }
}