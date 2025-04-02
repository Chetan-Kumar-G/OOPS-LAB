import java.util.Scanner;

class students{
    private String name;
    private int roll;
    private String grade;

    public void setname(String name1){
        name=name1;
    }

    public void setgrade(String grade1){
        grade=grade1;
    }

    public void setroll(int roll1){
        roll=roll1;
    }



    public String getname(){
        return name;
    }

    public String getgrade(){
        return grade;
    }

    public int getroll(){
        return roll;
    }


}
public class encapsulation_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name - ");
        String name1 = sc.nextLine();
        System.out.println("");
        System.out.print("grade - ");
        String grade1 = sc.nextLine();
        System.out.println("");
        System.out.print("roll - ");
        int roll1 = sc.nextInt();
        students obj = new students();
        obj.setname(name1);
       
        obj.setgrade(grade1);
        
        obj.setroll(roll1);

        System.out.println("name="+" "+obj.getname());
        System.out.println("roll="+" "+obj.getroll());
        System.out.println("grade="+" "+obj.getgrade());
    }
    
}
