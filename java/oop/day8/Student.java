/*This program is for static variable purpose
 * Author : Sk Azmaail
 * B.Tech, M.Tech
 */

package oop.day8;
public class Student {
  String name;
  int age;
  static String univ_name = "GCECT";

  Student(String n, int ag){
    name = n;
    age = ag;
  }
 void display(){
    System.out.println("name: "+name);
    System.out.println("age: "+age);

 }
}