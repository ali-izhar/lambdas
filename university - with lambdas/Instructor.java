package v3;

/**
 * This class creates an instructor of type Person. It implements all the details
 * of the Person class with an additional field and getter/setter for that field.
 * @author Izhar Ali
 *
 */
public class Instructor extends Person {
	
	private String department;
	
	/**
	 * When we create an instructor, in essence, we are creating a person. Hence, we 
	 * call the constructor for the parent class (Person).
	 */
	public Instructor(String firstName, String middleName, String lastName, String email, String ssn, int age, String department) {
		super(firstName, middleName, lastName, email, ssn, age);
		this.department = department;
	}
	
	/**
	 * Get the instructor's department.
	 * @return this method returns the department the instructor belongs to
	 */
	public String getDepartment() {
		return department;
	}

	
	/**
	 * If the input department is not null, assign it to the instructor's department; else print an error. 
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;	
	}
	
	/**
	 * This method adds an additional detail to the parent display method
	 */
	public void display() {
		super.display();
		System.out.println(this.getDepartment());
	}
}
