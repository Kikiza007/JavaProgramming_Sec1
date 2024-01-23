
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	Date(){
		dMonth = 1;
		dDay = 1;
		dYear = 1990;
		
	}
	
	Date(int month, int day,int year){
		dMonth = month;
		dDay = day;
		dYear = year;
		
	//setter and getter method	
	}
	public void setDate(int month, int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	//Method to return the month
	public int getMonth() {
		return dMonth;
	}
	
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		return dMonth + "-" + dDay + "-" + dYear;
	}
	

}
