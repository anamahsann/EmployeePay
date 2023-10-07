package employeeAssignment_v2;
/*Class Address will pass input information to Address method
*It will determine if street, city, state, and zipcode are given by the user
*It will then turn to string and output employee address
*/
public class Address {

	//Create private variables for street, city, state and zipcode
	private String street;
	private String city;
	private String state;
	private String zipCode;
	//Pass input into Address method
	public Address(String street, String city, String state, String zipCode) {
	//Assign input into private variables
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipCode = zipCode;
	}
	//Get Street
	public String getStreet() {
	return this.street;
	}
	//Determine if user provided input, then assign input to private variable
	public void setStreet(String street) {
	if (street.isEmpty()) {
	System.out.println("Error! Employee's street of address was left empty!");
	this.street = " ";
	}
	else {
	this.street = street;
	}
	}
	//Get City
	public String getCity() {
	return this.city;
	}
	//Determine if user provided input, then assign input to private variable
	public void setCity(String city) {
	if (city.isEmpty()) {
	System.out.println("Error! Employee's city of address was left empty!");
	this.city = " ";
	}
	else {
	this.city = city;
	}
	}
	//Get State
	public String getState(){
	return this.state;
	}
	//Determine if user provided input, then assign input to private variable
	public void setState(String state) {
	if (state.isEmpty()) {
	System.out.println("Error! Employee's state of address was left empty!");
	this.state = " ";
	}
	else {
	this.state = state;
	}
	}
	//Get zipcode
	public String getZipCode() {
	return this.zipCode;
	}
	//Determine if user provided input, then assign input to private variable
	public void setZipCode(String zipCode) {
	if (zipCode.isEmpty()) {
	System.out.println("Error! Employee's zipcode of address was left empty!");
	this.zipCode = " ";
	}
	else {
	this.zipCode = zipCode;
	}
	}
	//Convert private variables into string to be printed in main
	public String toString() {
	String str = "" + this.street + ", " + this.city + ", " + this.state + ", " + this.zipCode;
	return str;
	}
} // end of Class Address