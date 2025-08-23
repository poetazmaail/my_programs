package oop.day19;

public class Teacher extends Person{
    String Qualification;
    void display2(){
        display1();
        System.out.println("Qualification: "+Qualification);
    }
}
