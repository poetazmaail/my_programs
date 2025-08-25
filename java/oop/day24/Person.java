package oop.day24;
//Usage of this keyword
public class Person {
    String name;
    int age;
    String hair_color;

    Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    Person(String name, int age, String hair_color){
        this(name,age);
        this.hair_color = hair_color;

    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("hair color: "+hair_color);
    }
}
