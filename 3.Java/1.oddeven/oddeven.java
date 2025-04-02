import java.util.*;
public class oddeven{

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number-");
		int num = obj.nextInt();

		if(num%2==0){
			System.out.println("the number is even");
		}

		else{
			System.out.println("the number is odd");
		}
	}
}
