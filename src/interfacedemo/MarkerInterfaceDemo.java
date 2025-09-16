package interfacedemo;

//Marker interface
interface Registerable {
}

//Student class implementing marker interface
class Student implements Registerable {
 int id;
 String name;
 double fee;
 String course;

 Student(int id, String name, double fee, String course) {
     this.id = id;
     this.name = name;
     this.fee = fee;
     this.course = course;
 }
}

public class MarkerInterfaceDemo {
 public static void main(String[] args) {
     Registerable s = new Student(102, "neha", 12000.3, "java");
     Registerable s1 = new Student(103, "ramu", 13000, "java");

     if (s instanceof Registerable) {
         System.out.println("Student is registered for this course");
     } else {
         System.out.println("Student is not registered for this course");
     }

     if (s1 instanceof Registerable) {
         System.out.println("Student is registered for this course");
     } else {
         System.out.println("Student is not registered for this course");
     }
 }
}
