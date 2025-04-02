import java.util.Scanner;

class user{
    String username;
    String email;
    
    user(String username, String email){
        this.username=username;
        this.email=email;
        System.out.println("name - "+username);
        System.out.println("Email - "+email);
    }

}

public class constructor_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username=sc.nextLine();
        String email = sc.nextLine();
        user obj = new user(username,email);
    }
}