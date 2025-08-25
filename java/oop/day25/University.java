package oop.day25;

/*
 * Final variable is not if instantiated then it is called blank final variable and if there is static written in its front then it is called static blank final variable.
 * Final class never be extended.
 * Final Method never ber overridden.
 */

public class University {
    static final String UNIVERSITY = "GCECT";
    final void display(){
        System.out.println("University name is: "+UNIVERSITY);
    }
}
