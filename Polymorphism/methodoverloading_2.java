import java.util.Scanner;

class mobilecharge{
    int min;
    boolean fastcharge;
    int charge = 40;

    void charge(int min){
        System.out.println("the charge will be"+ (charge+20));
    }

    void charge(int min,boolean fastcharge){
        if (fastcharge){
            System.out.println("the fastcharge will be"+ (charge+40));
        }

        else{
            System.out.println("the charge will be"+ (charge+20));
        }
        
    }

}
public class methodoverloading_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fastcharge = sc.nextBoolean();
        int min = sc.nextInt();

        mobilecharge obj1 = new mobilecharge();
        obj1.charge(min);
        System.out.println("------------------second------------------------");

        obj1.charge(min, fastcharge);
    }
}
