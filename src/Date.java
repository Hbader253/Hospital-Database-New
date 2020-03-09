
public class Date {
	private int year; // year
	private int month;
	private int day;
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public String getDate() {
		return String.valueOf(day) + String.valueOf(month) + String.valueOf(year);
	}

	
	public Date() {
		
	}

}
