package oop.day23;

public class Car extends Vehicle {
    int gear;
    Car(String colour, int weight, int gear){
        super(colour,weight);
        this.gear = gear;

    }
    @Override
    void display(){
        super.display();
        System.out.println("The ger is : "+gear);
    }
}
