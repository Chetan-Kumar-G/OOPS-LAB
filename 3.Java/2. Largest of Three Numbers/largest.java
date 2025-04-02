import java.util.*;
public class largest{

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first Number-");
		int num1 = obj.nextInt();
		System.out.print("Enter second Number-");
		int num2 = obj.nextInt();
		System.out.print("Enter third Number-");
		int num3 = obj.nextInt();

		if(num1>num2){
			if(num1>num3){
				System.out.println("the First number is Greatest" + num1);
			}
			else if(num3>num1){
				System.out.println("the Third number is Greatest" + num3);
			}
			else{
				System.out.println("Two numbers are same");
			}
		}

		else if(num2>num1){
			if(num2>num3){
				System.out.println("the Second number is Greatest" + num2);
			}
			else if(num3>num2){
				System.out.println("the Third number is Greatest" + num3);
			}
			else{
				System.out.println("Two numbers are same");
	
			}

		}
	}
}
