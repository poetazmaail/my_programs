public class Teachers {
    String Name;
    int age;
    String gender;
    String phoneNo;
    Teachers(){
        System.out.println("No value");
    }
    Teachers(String a, int b, String c, String d){
          Name = a;
          age = b;
          phoneNo = c;
          gender = d;

    }
    void display(){
         System.out.println("Name: "+Name);
        System.out.println("Age: "+age);
        System.out.println("Phone No."+phoneNo);
        System.out.println("gender: "+gender);
    }
}