import java.util.*;
public class armstrongNumber{

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number-");
		int num = obj.nextInt();
		int num2=num;
		int sum= 0;
		String str = String.valueOf(num);
		int len = str.length();

		while (num!=0){
			int digit=num%10;
			sum=sum+(int) Math.pow(digit, len);
			num=num/10;
		}
		if(sum==num2){
			System.out.println("this is an Armstrong number");
		}
		else{
       			System.out.println("this is not an Armstrong number");
		}
	}
}
