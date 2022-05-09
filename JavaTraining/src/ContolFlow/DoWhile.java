package ContolFlow;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int  n;
		do
		{
		 System.out.println("enter a number between 1 and 10");
		 n=s.nextInt();
		} while(n<1 || n>10);
		
		System.out.println(n+ "is between 1 and 10");
				

	}

}
