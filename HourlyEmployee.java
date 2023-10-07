package employeeAssignment_v2;
/*SubClass HourlyEmployee will be instantiated through user input in main 
*It will display the employees hours works, rate, earnings and give all the attributes of the superclass Employee
*It will calculate earnings by evaluating the user input of hours worked and set rate values 
*It will turn to string the attributes of this class and call to the toString method of the superclass 
*/

//Subclass to extend Employee superclass
public class HourlyEmployee extends Employee{
   
   //Protected variables to be used by subclass
	protected int empHours;
	protected int earnings; 
	protected int normRate = 20;
	protected int overRate = 30; 
	
	//Method to pass input into for HourlyEmployee
	public HourlyEmployee(String typeEmp, int empHours, int number, String firstName, String lastName, String street, String city, String state, String zipCode,
			int month, int day, int year) {
	
	super(number, firstName, lastName, street, city, state, zipCode, month, day, year); //Use super to call attributes from Employee class
	setEmpHours(empHours); //Set employee hours worked from input
	}
	
	public int getEmpHours() { //Get employee hours worked variable
		return this.empHours;
	}
	
	//Evaluate hours worked to calculate earnings using set rates then assign empHours and earnings value 
	public void setEmpHours(int empHours) { 
		if (empHours == 40) {
			this.empHours = empHours;
			earnings = normRate*40;
		}
		if (empHours > 40) {
			this.empHours = empHours;
			earnings = (normRate*40) + ((empHours - 40)*overRate);
		}
		if (empHours < 40) {
			this.empHours = empHours;
			earnings = empHours*normRate; 
		}
	}
	
	//Convert hours worked, rate, earnings and Employee Class attributes to string to be printed in Main 
	public String toString() {
		String str = ""+ "Hourly Employee - Hours worked by Employee: " + this.empHours +" Pay rate is $" + normRate + "/hr Overtime rate is $"+ overRate + "/hr Earnings: $" + earnings + "\n" + super.toString();
		return str;
	}
} //end of subclass HourlyEmployee
