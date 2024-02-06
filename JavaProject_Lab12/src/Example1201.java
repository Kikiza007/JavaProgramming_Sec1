import java.util.Scanner;
import java.io.*;
public class Example1201 {
	public static void main(String[] args) throws IOException{
		// using scanner class for read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
        while(readFile.hasNext()) {
        	//read name from file
        	String fname = readFile.next();//read name
        	readFile.next();
        	readFile.next();
        	String email = readFile.next().toUpperCase();
        	System.out.println(fname+" "+"("+ email +")");
        }
        readFile.close();
	}

}
