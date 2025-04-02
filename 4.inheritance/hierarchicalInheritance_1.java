import java.util.Arrays;
class Employee{
    String name;
    String department;
    double salary;

    Employee(String name,String department,double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    void displayInfo(){
        System.out.println("Name - "+name);
        System.out.println("Department - "+department);
        System.out.println("Salary - "+salary);
    }
}

class manager extends Employee{
    String[] team = new String[4];

    manager(String name,String department,double salary,String[] team){
        super(name,department,salary);
        this.team=team;
    }
    void displayManagerInfo(){
        //System.out.println(Arrays.toString(team));
        for(String name:team){
            System.out.println(name);
        }
        displayInfo();
    }

    
}

class developer extends Employee{
    String[] languages;

    developer(String name,String department,double salary,String[] languages){
        super(name,department,salary);
        this.languages=languages;
    }
    void displayDeveloperInfo(){
       for(String name:languages){
            System.out.println(name);
        }
        displayInfo();
    }

   
}

public class hierarchicalInheritance_1{
    public static void main(String[] args){
        String[] team = {"chetan","agneay","prasannaa","vivek","susendran"};
        String[] lang = {"java","python","c++","c"};
        manager obj1 = new manager("chetan","cse",1000000,team);
        System.out.println("------------Manager details-----------");
        obj1.displayManagerInfo();
        System.out.println("------------Developer details-----------");
        developer obj2 = new developer("chetan","cse",1000000,lang);
        obj2.displayDeveloperInfo();
    }
}