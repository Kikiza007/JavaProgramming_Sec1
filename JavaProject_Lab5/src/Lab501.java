import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullname = scan.nextLine();
		int space = fullname.trim().indexOf(" ");
		
		if(space==-1) {
			System.out.print("Incorrect Name");
			
		}else{
			String firstName = fullname.substring(0,space);
			String lastName = fullname.substring(space,1);
			System.out.println("First name: "+firstName.toUpperCase());
			System.out.println("Last name: "+ lastName.toLowerCase());
		}
		
		

	}

}
