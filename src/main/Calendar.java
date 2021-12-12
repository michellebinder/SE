package main;

public class Calendar {
	
	int year;
	
	public Calendar(int year) {
		this.year = year;
	}

	public boolean isLeapYear() {
		return (this.year > 0 && this.year % 4 == 0) && (this.year % 100 != 0 || this.year % 400 == 0);
	}{
	
	// year should not be smaller than 0 
	if(this.year < 0) {
		System.out.println(("Year smaller than 0!"));
	}
	
	
}

}

