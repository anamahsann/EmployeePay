package employeeAssignment_v2;
/*Class Employee will pass input information to class Name, Address and Hire Date
*It will set employee number 
*It will then turn to string and output employee number, name, address and hire date
*/
public class Employee {
   
	//Create private variable for input of employee number
	protected int number;
		
	//Create private variables for new instances of each Class to pass input into;
	protected Name name;
	protected Address address;
	protected Date hireDate;
		
	//Pass input into classes and set employee number through Employee method
	Employee(int number, String firstName, String lastName, String street, String city, String state, String zipCode,
	int month, int day, int year) {
		
	setNumber(number); //Set number from user input
		
	//Assign new instances of each class to new private variables with user input
	this.name = new Name(firstName,lastName);
	this.address = new Address(street, city, state, zipCode);
	this.hireDate = new Date(month, day, year);
	}
		
	//Designate new private variable with user input
	public int getNumber() {
	return this.number;
	}
	
	public void setNumber(int number) {
	this.number = number;
	}
		
	//Convert private variables into string to be printed in main
	public String toString() {
	String str = "" + "Employee #: "+ number + ", Name: " + name + ", Address: " + address + ", Hire Date:" + hireDate;
	return str;
	}
		
} // End of class Employee