package oop.day10;

public class Test {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.totalStudent(); //It will print 1
       Student s2 = new Student();//It will print 1 if variable is not static because for every object it takes separate memory and if it is static then the value is 2
       s2.totalStudent();
       Student s3 = new Student();
       s3.totalStudent(); // The value is 1 if not static and if static the value is 3
    }
}
