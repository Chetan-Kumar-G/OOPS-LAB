import java.util.Scanner;

class car{
    private String model;
    private int speed;
    
    public void setmodel(String model1){
        model = model1;
    }

    public void setspeed(int speed1){
        speed = speed1;
    }

    public String getmodel(){
        return model;
    }

    public int getspeed(){
        return speed;
    }

    public void acceleration(int amount){
        
        if(speed + amount<=200){
            speed=speed+amount;
            System.out.println("the acceleration amount="+" "+ amount +", current speed " + speed);
        }

        else{
            System.out.println("maximum speed is 200");     
        }
        
    }
}
public class encapsulation_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter model");
        String model=sc.nextLine();

        System.out.print("enter speed");
        int speed=sc.nextInt();

        System.out.print("enter acceleration");
        int acceleration=sc.nextInt();

        car obj =new car();

        obj.setmodel(model);
        obj.setspeed(speed);
        System.out.println("the model is = "+obj.getmodel());
        System.out.println("the speed is = "+obj.getspeed());
        obj.acceleration(acceleration);

        
    }
    
}
