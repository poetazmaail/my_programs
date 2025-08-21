package oop.day15;

public class Test {
    public static void main(String[] args) {
    CallByValue c1 = new CallByValue();
    int x = 10;
    System.out.println("Before calling: "+x);
    c1.change(x);
    System.out.println("After calling: "+x);

    
    }
}
