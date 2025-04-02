import java.util.*;
public class fibonacciSeries{

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number-");
		int num = obj.nextInt();
		int a= 0;
		int b= 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		num=num-2;
		while (num!=0){
			int sum= a+b;
			System.out.print(sum + " ");
			a=b;
			b=sum;
			num=num-1;
		}
	}
}
