import java.util.Scanner;
import java.io.*;
import java.text.*;
public class ATMBanking {

	public static void main(String[] args)throws IOException {
		
		Scanner input = new Scanner(System.in);
		Scanner readFile = new Scanner(new File("d://ATMBookBank.txt"));
		System.out.print("Enter account number:");
		String accountNumber = input.next();
		while(!(accountNumber.substring(0).equals("insert"))){
			System.out.print("Input wrong type, Enter account number");
		};

	}

}
