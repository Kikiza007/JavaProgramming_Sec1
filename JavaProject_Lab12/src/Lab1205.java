import java.io.*;
import java.util.Scanner;
public class Lab1205 {

	public static void main(String[] args)throws IOException{ 
		Head();
		Scanner readFile = new Scanner(new FileReader("d://txtFile//student.txt"));
		int i =1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String Fname = readFile.next().substring(0,1).toUpperCase();
			String Lname = readFile.next();
			double grade = readFile.nextDouble();
			int level = readFile.nextInt();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"+Fname+"."+Lname+"\t"+grade+"\t"+Status(grade));
			i++;
	}
		readFile.close();
 }
			
	public static String Level(String id) throws IOException{
		int stLevel = Integer.parseInt(id.substring(0,2));
		int stYear = 22-stLevel;
		return stYear+"th";
	}
	public static String Status(double grade) {
		if(grade>2.00) {
			return"Pass";
		}else if (grade>=1.00 && grade <=2.00) {
			return "Critical";
		}else return"Retried";
	}
	public static void Head() {
		System.out.println("No.\tID\t\tLevel Name\t\tGrade Status");
		System.out.println("*************************************************************");
	}

}
