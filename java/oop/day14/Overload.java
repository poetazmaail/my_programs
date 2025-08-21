package oop.day14;
// Example of method overloading.

public class Overload {
    void add(){
        System.out.println("I have no parameter!");
    }
    void add(int a, int b){
        System.out.println("SUM: "+(a+b));
    }
}
