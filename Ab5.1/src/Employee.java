
public class Employee {
	String firstname;
	String lastname;
	public static int Count = 0;
	public Employee(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
		Count++;
	}
	
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	
	public String getFirstname(){
		return firstname;
	}
	
	public String getLastname(){
		return lastname;
	}
	
	public String toString(){
		return firstname + " " + lastname + " | Es gibt " + Count + " Mitarbeiter.";
	}
}
