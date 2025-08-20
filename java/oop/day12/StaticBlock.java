package oop.day12;

public class StaticBlock {
    static String name;
    static int age;

    static {
        System.out.println("I am static block.");
        name = "Azmaail";
        age = 25;
    }
    static void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        display(); // We can't call a non-static method from static method
        // Satic Block executes before main Method.
    }

}
