package employeeAssignment_v2;
/*Class Date will pass input information to Date method
*It will determine if valid month, day and year are given by the user
*It will then turn to string and output employee hire date
*/
public class Date {

   //Create private variables for month day and year;
   private int month;
   private int day;
   private int year;
   //Set month, day and year
   public Date( int month, int day, int year ) {
      setMonth(month);
      setDay(day);
      setYear(year);
   }
   
   //Get Month
   public int getMonth() {
      return this.month;
   }
   
   //Determine if month is valid input and then assign to private variable
   public void setMonth(int month) {
      if ((month >= 1) && (month <= 12)) {
         this.month = month;
      }
      else {
         System.out.println("Error! The month must be between 1 and 12!");
         this.month = 0;
      }
   }
   
   //Get Day
   public int getDay() {
      return this.day;
   }
   //Determine if day is valid input and then assign to private variable
   public void setDay(int day) {
      if ((day >= 1) && (day <= 31)) {
         this.day = day;
      }
      else {
         System.out.println("Error! The day must be between 1 and 31");
         this.day = 0;
      }
   }
   
   //Get Year
   public int getYear() {
      return this.year;
   }
   //Determine if year is valid input and then assign to private variable
   public void setYear(int year) {
      if ((year >= 1900) && (year <= 2020)) {
         this.year = year;
      }
      else {
         System.out.println("Error! The year must be between 1900 and 2020!");
         this.year = 0;
      }
   }
   
   //Convert private variables into string to be printed in main
   public String toString() {
      String str = "" + this.month + "/" + this.day + "/" + this.year;
      return str;
   }
   
} // end of Class Date