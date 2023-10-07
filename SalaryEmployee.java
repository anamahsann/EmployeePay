package employeeAssignment_v2;
/*SubClass SalaryEmployee will be instantiated through user input in main
*It will display the employees salary and give all the attributes of the superclass Employee
*It will turn to string the salary and call to the toString method of the superclass 
*/

//Subclass to extend Employee superclass
public class SalaryEmployee extends Employee{
	
	protected String typeEmp; //Protected variable of employee type 
	
	//Method to pass input into for SalaryEmployee
	public SalaryEmployee(String typeEmp, int number, String firstName, String lastName, String street, String city, String state, String zipCode,
			int month, int day, int year) {
	
	super(number, firstName, lastName, street, city, state, zipCode, month, day, year); //Use super to call attributes from Employee class
	setTypeEmp(typeEmp); //Set employee type from input
		}
	
	public String getTypeEmp() { //Get employee type variable
		return this.typeEmp;
		}
	
	//Evaluate employee type to assign salary to typeEmp
	public void setTypeEmp(String typeEmp) { 
		if (typeEmp.isEmpty()) {
			System.out.println("Error! Employee category was left empty!");
			this.typeEmp = " ";
		}
		else {
			this.typeEmp = "$50 000";
		}
	}	
	
	//Convert salary and Employee Class attributes to string to be printed in Main 
	public String toString() {
		String str = ""+ "Salary Employee - Annual Earnings: " + this.typeEmp + "\n" + super.toString();
		return str;
	}
} //end class SalaryEmployee
