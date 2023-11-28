import java.util.*;
 
public class Lab401 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X,Y;
		System.out.print("Input value of X : ");
		X = scan.nextInt();
		int sum=X;
		System.out.print("Input value of Y : ");
		Y = scan.nextInt();
		while(Y<X) {
			System.out.print("Input value of Y, again : ");
			Y = scan.nextInt();
		}
		System.out.println();
		while(X<Y) {
			X++;
			int total = sum+X;
			System.out.println(sum+" + "+X+" = "+total);
			sum=total;
		}
	}
 
}

 