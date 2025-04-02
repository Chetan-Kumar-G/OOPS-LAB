abstract class Employee {
    String name;
    int id;

    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    abstract double calculateSalary();
}


class SalariedEmployee extends Employee {
    double monthlySalary;

    public SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}


class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}




public class abstraction_2{
    public static void main(String[] args) {
        Employee emp1 = new SalariedEmployee("Alice", 101, 50000);
        Employee emp2 = new HourlyEmployee("Bob", 102, 500, 160);

        System.out.println(emp1.name + "'s Salary: " + emp1.calculateSalary());
        System.out.println(emp2.name + "'s Salary: " + emp2.calculateSalary());
    }
}
