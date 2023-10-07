package employeeAssignment_v2;
/*Class Name will pass input information to Name method
*It will determine if first name and last name are given by the user
*It will then turn to string and output first name and last name
*/
public class Name {

	//Create private variables for first and last name
	private String firstName;
	private String lastName;
	//Set first and last name
	Name(String firstName, String lastName) {
	setFirstName(firstName);
	setLastName(lastName);
	}
	
	//Get first name
	public String getFirstName() {
	return this.firstName;
	}
	
	//Determine is first name is given in user input and then put in private variable
	public void setFirstName(String firstName) {
	if (firstName.isEmpty()) {
	System.out.println("Error! Employee first name was left empty!");
	this.firstName = " ";
	}
	else {
	this.firstName = firstName;
	}
	}
	
	//Get last name
	public String getLastName() {
	return this.lastName;
	}
	
	//Determine is last name is given in user input and then put in private variable
	public void setLastName(String lastName) {
	if (lastName.isEmpty()) {
	System.out.println("Error! Employee last name was left empty!");
	this.lastName = " ";
	}
	else {
	this.lastName = lastName;
	}
	}
	
	//Convert private variables into string to be printed in main
	public String toString() {
	String str = "" + this.firstName + " " + this.lastName;
	return str;
	}
} // end of Class Name