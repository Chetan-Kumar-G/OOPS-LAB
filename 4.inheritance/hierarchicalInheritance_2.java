import java.util.*;
class person{
    String name;
    int age;
    String address;

    person(String name,int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    void displayInfo(){
        System.out.println("Name - "+name);
        System.out.println("age - "+age);
        System.out.println("address - "+address);
    }
}

class student extends person{
    String[] course = new String[5];
    int id;

    student(String name,int age, String address,String[] course,int id){
        super(name,age,address);
        this.course=course;
        this.id=id;
    }
    void displayStudentInfo(){
        //System.out.println(Arrays.toString(team));
        for(String name:course){
            System.out.print(name+", ");
            
        }
        System.out.println();
        System.out.println("Id - "+id);
        displayInfo();
    }

    
}

class teacher extends person{
    String subject;

    teacher(String name,int age, String address,String subject){
        super(name,age,address);
        this.subject=subject;
        
    }
    void displayTeacherInfo(){
        System.out.println("subject - "+subject);
        displayInfo();
    }

    
}

public class hierarchicalInheritance_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr= new String[4];
        for (int i=0 ; i<=3 ; i++){
            String arrele=sc.nextLine();
            arr[i]=arrele;
        }
        String name = sc.nextLine();
        String address = sc.nextLine();
        int age = sc.nextInt();
        int id = sc.nextInt();
        student obj1 = new student(name,age,address,arr,id);
        System.out.println("------------Students details-----------");
        obj1.displayStudentInfo();


        sc.nextLine();
        String tname = sc.nextLine();
        String taddress = sc.nextLine();
        String tsubject = sc.nextLine();
        int tage = sc.nextInt();
        teacher obj2 = new teacher(tname,tage,taddress,tsubject);
        System.out.println("------------Teacher details-----------");
        obj2.displayTeacherInfo();
    }
}