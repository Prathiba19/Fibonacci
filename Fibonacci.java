# Fibonacci
import java.util.Scanner;


public class Fibonacci {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n1=0;
			int n2=1;
			int n3;
			System.out.println("enter the count:");
			int count=sc.nextInt();
			for(int i=2;i<=count;i++)
			{
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
	

	}

}
