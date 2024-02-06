import java.io.*;
import java.util.Scanner;
public class Example1202 {

	public static void main(String[] args)throws IOException {//read data from keyboard
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section: ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);

	}
	public static void showListStudent(int sectionInput)throws IOException {//read data from file
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp = "";
		while((tmp= readFile.readLine())!= null) {
			String[] data = tmp.split("\t");
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			
			if(sectionFile==sectionInput) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermScore
						+"\t"+finalScore+"\t"+findResult(midtermScore,finalScore));
			}
			
		}
		readFile.close();
	}
	public static String findResult(double midtermscore,double finalscore) {
		double totalScore = midtermscore + finalscore;
		if(totalScore<=40)return "Fail";
		else return "Pass";
	}
	public static void Header(int sec) {
		System.out.println("************************************************");
		System.out.println("\tList of Data for Section" + sec);
		System.out.println("************************************************");
		
	}

}
