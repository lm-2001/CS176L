
	/**
	   A person is represented by the name and a birth year.
	   You must enter the class name, instance variable(s), and constructor below
	*/

	/**
	      Returns the string representation of the object.
	      @return a string representation of the object
	*/
	public class Person {
	
	private String name;
	private String birthYear;
	
	public Person (String name, String birthYear){
		this.name = name;
		this.birthYear = birthYear;  
	}
	
	public void p1(String name, String birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public void p2(String name, String birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	   public String toString()
	   {
	      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	   }


}
