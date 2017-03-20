
public class Date {
	String month;
	String day;
	String year;
	public Date(int month, int day, int year){
		if(month >= 1 && month <= 12)
			this.month = String.valueOf(month);
		else
			this.month = "12";
		
		if(day >= 1 && day <= 31)
			this.day = String.valueOf(day);
		else
			this.day = "9";
		
		if(year >= -2000 && year <= 3000)
			this.year = String.valueOf(year);
		else
			this.year = "2015";
	}
	
	public Date(String month, int day, int year){
		switch (month) {
		case "Januar": this.month = "1"; break;
		case "Februar": this.month = "2"; break;
		case "März": this.month = "3"; break;
		case "April": this.month = "4"; break;
		case "Mai": this.month = "5"; break;
		case "Juni": this.month = "6"; break;
		case "Juli": this.month = "7"; break;
		case "August": this.month = "8"; break;
		case "September": this.month = "9"; break;
		case "Oktober": this.month = "10"; break;
		case "November": this.month = "11"; break;
		case "Dezember": this.month = "12"; break;
		default: this.month = "12"; break;
		}
		
		if(day >= 1 && day <= 31)
			this.day = String.valueOf(day);
		else
			this.day = "9";
	
		if(year >= -2000 && year <= 3000)
			this.year = String.valueOf(year);
		else
			this.year = "2015";
	}
	
	public Date(int month, int year){
		if(month >= 1 && month <= 12)
			this.month = String.valueOf(month);
		else
			this.month = "12";

		this.day = "9";
		
		if(year >= -2000 && year <= 3000)
			this.year = String.valueOf(year);
		else
			this.year = "2015";
	}
	
	public String toString(){
		return day+"."+month+"."+year;
	}
	
	public int getDay(){
		return Integer.valueOf(day);
	}
	
	public int getMonth(){
		return Integer.valueOf(month);
	}
	
	public int getYear(){
		return Integer.valueOf(year);
	}
}
