import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String message = scan.nextLine();
		message = message.toLowerCase();
		int indexnichi = message.indexOf("nichi");
		
		if(indexnichi>=0) {
			System.out.print("Nichi is sentence");
		}else {
			System.out.print(message);
		}

	}

}
