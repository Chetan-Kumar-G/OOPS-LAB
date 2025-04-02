import java.util.*;
class Person {
    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }


    void displayStudentInfo() {
        displayInfo();  
        System.out.println("Grade: " + grade);
    }
}

public class singleInheritance_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name - ");
        String name=sc.nextLine();
        System.out.print("enter grade - ");
        String grade=sc.nextLine();
        System.out.print("enter age - ");
        int age=sc.nextInt(); 
        Student student = new Student(name,age,grade);
        student.displayStudentInfo();
    }
}

