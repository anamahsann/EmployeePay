package employeeAssignment_v2;
import java.util.ArrayList;
import java.util.Scanner;
/*Class EmployeeTest will gather all the input to create employee record
*It will create a new employee record either Salary or Hourly Employee. 
*It will pass input to other classes and subclasses.
*It will then display the records of all employees.
*/
public class EmployeeTest {
   
	public static void main(String[] args) {
		int newEmps; //Variable to get number of employee records to be entered
		
		//Ask user for how many employee records they would like to create
		Scanner newemp = new Scanner(System.in);
		System.out.println("How many employee records would you like to enter? Enter number in digits. ");
		newEmps = newemp.nextInt();
		
		//Create Array List to store all employee records
		ArrayList<Employee> empList = new ArrayList<>();
		
		//A for loop to gather input until desired number of records created
		for (int empNum = 0; empNum < newEmps; empNum++) {			
			
		   //Get Employee number from user
		   int number;
		   String numberStr = "";
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter Employee number: ");
		   numberStr = scanner.nextLine();
		   number = Integer.parseInt(numberStr);
		
		   //Get Employee first name from user
		   String firstName = "";
		   Scanner fname = new Scanner(System.in);
		   System.out.println("Enter Employee first name: ");
		   firstName = fname.nextLine();
		
		   //Get Employee last name from user
		   String lastName = "";
		   Scanner lname = new Scanner(System.in);
		   System.out.println("Enter Employee last name: ");
		   lastName = lname.nextLine();
		
		   //Get Employee street address from user
		   String street = "";
		   Scanner streets = new Scanner(System.in);
		   System.out.println("Enter street of Employee address: ");
		   street = streets.nextLine();
		
		   //Get Employee city address from user
		   String city = "";
		   Scanner cities = new Scanner(System.in);
		   System.out.println("Enter city of Employee address: ");
		   city = cities.nextLine();
		
		   //Get Employee state address from user
		   String state = "";
		   Scanner states = new Scanner(System.in);
		   System.out.println("Enter state of Employee address: ");
		   state = states.nextLine();
		
		   //Get Employee zipcode address from user
		   String zipCode = "";
		   Scanner zipCodes = new Scanner(System.in);
		   System.out.println("Enter zipcode of Employee address: ");
		   zipCode = zipCodes.nextLine();
		
		   //Get Employee month of hire from user
		   int month;
		   String monthStr = "";
		   Scanner months = new Scanner(System.in);
		   System.out.println("Enter Employee numeric Month of Hire: ");
		   monthStr = months.nextLine();
		   month = Integer.parseInt(monthStr);
		
		   //Get Employee date of hire from user
		   int day;
		   String dayStr = "";
		   Scanner days = new Scanner(System.in);
		   System.out.println("Enter Employee Date of Hire: ");
		   dayStr = days.nextLine();
		   day = Integer.parseInt(dayStr);
		
		   //Get Employee year of hire from user
		   int year;
		   String yearStr = "";
		   Scanner years = new Scanner(System.in);
		   System.out.println("Enter Employee Year of Hire: ");
		   yearStr = years.nextLine();
		   year = Integer.parseInt(yearStr);
		
		   //Create new employee and pass input to Class Employee
		   Employee employee = new Employee(number, firstName, lastName, street, city, state, zipCode, month, day, year);
		
		   //Get type of employee Salary or Hourly
		   String typeEmp = "";
		   int empHours;
		   Scanner tEmp = new Scanner(System.in);
		   System.out.println("Is your Employee,'Hourly' (Y or N): ");
		   typeEmp = tEmp.nextLine();
		      //If Hourly Employee get number of hours worked 
			   if (typeEmp.equalsIgnoreCase("Y")){
			      String hoursStr = ""; 
			      Scanner empHour = new Scanner(System.in);		
			      System.out.println("Enter hours worked in week: ");
			      hoursStr = empHour.nextLine();
			      empHours = Integer.parseInt(hoursStr);
			      //Instantiate HourlyEmployee
			      HourlyEmployee HourlyEmployee = new HourlyEmployee(typeEmp, empHours, number, firstName, lastName, street, city, state, zipCode, month,
						day, year);	
			      empList.add(HourlyEmployee);	//Add to array
			   }
			   
			   else {
				empHours = 40; 
				//Instantiate Salayry Employee
				SalaryEmployee SalaryEmployee = new SalaryEmployee(typeEmp, number, firstName, lastName, street, city, state, zipCode, month,
						day, year);
				empList.add(SalaryEmployee);//Add to array 
			   }
		
		}//End of for loop for gathering employee records
		
		//Print all Employee records in array
		for (int i = 0; i <empList.size(); i++) {
		System.out.println(empList.get(i) + "\n");
		} //End of for loop for printing array-list
		
	} // End main ()
} // End of Class EmployeeAssignment
	

