package Day6;

public class Teacher {
    String name;
    int age;
    public Teacher(){
        System.out.println("No information.");
    }
    public Teacher(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
