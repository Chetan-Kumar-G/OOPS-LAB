import java.util.*;
public class factorial{

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number-");
		int num = obj.nextInt();
		int factorial=1;
		for (int i=1; i<=num; i++){
			factorial=factorial*i;
		}
		System.out.print(factorial);
	}
}
