package oop.day27;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat(){//Anonomyous class is being created.
            @Override
            void display(){
               System.out.println("I am a cat.");
            }
        };
        c.display();
    }
}
