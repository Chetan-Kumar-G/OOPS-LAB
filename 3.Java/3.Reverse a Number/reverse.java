import java.util.*;
public class reverse{

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number-");
		int num = obj.nextInt();
		int reverse = 0;

		while (num!=0){
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println("the reverse digit is " + reverse);
	}
}
