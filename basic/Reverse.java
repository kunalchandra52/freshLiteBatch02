import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int v=0;
		while(n>0){
			int r=n%10;
			v=(v*10)+r;
			n=n/10;
			}
	System.out.println(v);
	}
}
		