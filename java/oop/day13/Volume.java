package oop.day13;

public class Volume {
    int height, depth, width;

    Volume(int h, int d, int w ){
        height = h;
        depth = d;
        width = w;
    }

    void display(){
        int volume = height * depth * width;
        System.out.println("Volume: "+volume);
    }
}
