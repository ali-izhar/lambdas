package v3;

/**
 * This class creates a student of type Person. It implements all the details
 * of the Person class with an additional field and getter/setter for that field.
 * @author Izhar Ali
 *
 */
public class Student extends Person {
	
	private String major;
	
	/**
	 * When we create a student, in essence, we are creating a person. Hence, we 
	 * call the constructor for the parent class (Person).
	 */
	public Student(String firstName, String middleName, String lastName, String email, String ssn, int age, String major) {
		super(firstName, middleName, lastName, email, ssn, age);
		this.major = major;
	}
	
	
	/**
	 * Get the student's major.
	 * @return this method returns the student's major
	 */
	public String getMajor() {
		return major;
	}

	
	/**
	 * If the input major is not null, assign it to the student's major; else print an error. 
	 * @param department
	 */
	public void setMajor(String major) {
		this.major = major;	
	}
	
	/**
	 * This method adds an additional detail to the parent display method
	 */
	public void display() {
		super.display();
		System.out.println(this.getMajor());
	}
	
}
