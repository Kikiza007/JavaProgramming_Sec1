import java.util.Scanner;
public class Lab604 {

		static Scanner input = new Scanner(System.in);
		static String studentId,subId;
		static int subJectId;
		boolean stdIT,subIT;
		
		public static void main(String[]args) {
			inputStudent();
		}//end of main()
		public static void inputStudent() {
			do {
			System.out.print("Enter Student Id:");
			studentId = input.next();
			System.out.print("Enter Subject Id:");
			subJectId = input.nextInt();
			subId = subJectId + "";
			}while(!isLength(studentId,subId));
			System.out.println();
			displaydata(isITStudent(studentId),isITStudent(subId));

		

	}//end of inpurStudent()
		public static boolean isLength(String sid,String subId) {
			if(sid.length()==10&&subId.length()==7) {
				return true;
			}
			return false;
		}//end of isLength()
		
		public static boolean isITStudent(String sid) {
			if(sid.substring(0,3).equals("211")&&sid.substring(3,6).equals("311")) {
				return true;
			}
			else return false;
		}//end of isITStudent()
		
		public static boolean isITStuject(String subId) {
			if(subId.substring(0,2).equals("21")&&subId.substring(4,5).equals("1")) {
				return true;
			}
			else return false;
		}//end of isITSubject()
		
		public static void displaydata(boolean stdIT,boolean subIT){
			if(stdIT==true) {
				System.out.println("Student id: "+studentId+"1st year student in IT");
		}else {
			System.out.println("Student id: "+studentId+"is not 1st year student in IT");
		}
			if(subIT==true) {
				System.out.println("Enroll in course for Year 1");
			}else {
				System.out.println("not Enroll in course for Year 1");
			}
		}

}
