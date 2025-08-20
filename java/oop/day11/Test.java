package oop.day11;

public class Test {
    public static void main(String[] args) {
    StaticMethod s1 = new StaticMethod();
    s1.display1(); //Object must be created for non static method.
    StaticMethod.display2(); //ClassName.method name is used for a static method.

    }
}
