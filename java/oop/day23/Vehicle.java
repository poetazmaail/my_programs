package oop.day23;

public class Vehicle {
    String colour;
    int weight;

    Vehicle(String colour, int weight){
        this.colour = colour;
        this.weight = weight;
    }

    void display(){
        System.out.println("Color: "+colour);
        System.out.println("Weight: "+weight);
    }
}
