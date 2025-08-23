/**
 *Author : Sk Azmaail
  Code for : Uses of varlength variable
  Date : 23/08/2025 
 **/package oop.day16;

public class AddDemo {
    void add (int ... num){
        int sum = 0;
        for(int x : num){
            sum += x;
        }
        System.out.println(num);
    }
}
