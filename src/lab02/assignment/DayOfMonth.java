package lab02.assignment;

public class DayOfMonth {
	private int month;
	private int year;
	
	public DayOfMonth() {
		
	};
	
	public DayOfMonth(int month, int year) {
		super();
		this.month = month;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	Boolean checkInput() {
		if(month < 1 || month > 12) {
			System.out.println("Wrong month");
			return false;
		}
		
		if(year < 0 || year > 10000) {
			System.out.println("Wrong Year");
			return false;
		}
		
		return true;
	}
	boolean checkLeapYear() {
		boolean leapYear = false;
		// Check leap year
		
		if(year % 100 == 0 && year % 400 != 0) {
			
		} else {
			if(year % 4 == 0) {
				leapYear = true;
			}
		}
		return leapYear;
	}
	
	int showDayInMonth() {
		boolean leapYear = checkLeapYear();
		
		
		int []leapYArr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int []notLeapYArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(leapYear == true) {
			return leapYArr[month - 1];
		}
		
		return notLeapYArr[month - 1];
	}
}
