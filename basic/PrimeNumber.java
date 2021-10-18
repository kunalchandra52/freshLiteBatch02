import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		if(n>0)
		{
			if(n%2==0)
			System.out.println("Not a prime");
			else
			System.out.println("Prime number");
		}
		else
		System.out.println("Plz enter number greater than 0");
			
	}
}