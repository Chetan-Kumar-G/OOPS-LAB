import java.util.*;
import java.util.Random;
public class guessNumber{

	public static void main(String[] args){
		Random random= new Random();
		int rannum = random.nextInt(100)+1;
		Scanner obj = new Scanner(System.in);
		Boolean a=true;
		while(a){
			System.out.print("Enter a Number-");
			int num = obj.nextInt();
			if (num==rannum){
				System.out.print("Congratulation!!! Correct");
				a=false;
			}
			else{
				System.out.println("Oops..., try again");
			}
		}
	}
}
