import java.util.*;
public class Lab603 {
	static Scanner name = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space. " + "\n:");
		String fullname = scan.nextLine();
 		String firstname = fullname.substring(0, fullname.indexOf(" "));
		String abbreviatName = abbreviatName(fullname);
		System.out.println(abbreviatName + " " + firstname);     
	   }
 	public static String abbreviatName(String fullname) {
		for(int i = 0; i < fullname.length(); i++) {
			if(fullname.charAt(i) == ' ') {
			return fullname.charAt(i + 1) + "." + fullname.charAt(i + 6);
       }
}
		    return fullname.substring(0, fullname.indexOf(" "));
       }
}