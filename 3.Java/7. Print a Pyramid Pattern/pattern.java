import java.util.*;
public class pattern{

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number-");
		int num = obj.nextInt();
		for (int i=1; i<=num; i++){
			for(int k=0; k<=num-i; k++){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
