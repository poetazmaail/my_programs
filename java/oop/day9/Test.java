package oop.day9;

public class Test {
    public static void main(String[] args) {
        // Student azmaail = new Student(); When there is non-static variable to be used, then making object is necessary.
        // When using static variable it is realted to ClassName.
        // System.out.println("Name: "+azmaail.univ_name); 'Tis will print the univ_name using object as it is not a static keyword.
        System.out.println("University name: "+Student.univ_name); // If the variable is static it can be used using class name, not using object name.

    }
}
