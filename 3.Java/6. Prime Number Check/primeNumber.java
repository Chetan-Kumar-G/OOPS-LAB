import java.util.*;
public class primeNumber{

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number-");
		int num = obj.nextInt();
		for (int i=2; i<num; i++){
			if(num%i==0){
				System.out.println("the number is not prime");
				break;
			}
			else{
				System.out.println("the number is prime");
			}
		}
	}
}
