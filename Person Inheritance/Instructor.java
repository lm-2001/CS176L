/**
   An instructor is represented by a name, a birth year, and a salary.
   You must enter the class name, instance variable(s), and constructor below
*/
   /**
      Returns the string representation of the object.
      @return a string representation of the object
   */

public class Instructor extends Person {
	
	private double salary;
	public Instructor (String name, String birthYear, double salary) {
		super(name, birthYear);
		this.salary = salary;
	}
	
   public String toString()
   {
      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
   }
}
