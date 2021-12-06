package v3;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.function.Predicate;

/**
 * This class stores basic information about a person.
 * @author Izhar Ali
 * @version 2021.10.18
 *
 */
public class Person {
	
	private static long initial_id = 916421998;

	
	private long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String ssn;
	private int age;
	
	/**
	 * An empty constructor. Fields are initialized by the setter methods. However, when we create
	 * an instance of the Person class, we assign each instance a specific id and increment each
	 * person's id by one.
	 */
	public Person(String firstName, String middleName, String lastName, String email, String ssn, int age) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.ssn = ssn;
		this.age = age;
		initial_id++;
		id = initial_id;
	}
	
	
	public static HashMap<String, Predicate<Person>> evaluation = new HashMap<String, Predicate<Person>>();
	static int oldest = 0;
	static int youngest = 100;
	static {
		evaluation.put("oldest", person -> person.getAge() >= Person.oldest);
		evaluation.put("youngest", person -> person.getAge() <= Person.youngest);
		evaluation.put("in their 20s", person -> person.getAge() > 19 && person.getAge() < 30);
	}
	
	

// ------------------------------ (GETTERS) -------------------------------------------------------------------------------- //
	
	/**
	 * Get the person's ID.
	 * @return this method returns the user's ID
	 */
	public long getId() {
		return id;
	}
	
	
	/**
	 * Get the person's first name.
	 * @return this method returns the user's first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	
	/**
	 * Get the person's middle name.
	 * @return this method returns the user's middle name
	 */
	public String getMiddleName() {
		return middleName;
	}
	
	
	/**
	 * Get the person's last name.
	 * @return this method returns the user's last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	
	/**
	 * Get the person's email.
	 * @return this method returns the user's email address
	 */
	public String getEmail() {
		return email;
	}
	
	
	/**
	 * Get the person's SSN.
	 * @return this method returns the user's SSN
	 */
	public String getSsn() {
		return ssn;
	}
	
	
	/**
	 * Get the person's age.
	 * @return this method returns the user's age
	 */
	public int getAge() {
		return age;
	}
	
// ------------------------------------------------------------------------------------------------------------------------- //		
	
	
	
	
	
	
// ------------------------------ (SETTERS) -------------------------------------------------------------------------------- //
	
	/**
	 * Set the input first name to the person's first name. 
	 * No validation required for input names.
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
			this.firstName = firstName;	
	}

	
	/**
	 * Set the input middle name to the person's middle name.
	 * No validation required for input names.
	 * @param middleName
	 */
	public void setMiddleName(String middleName) {
			this.middleName = middleName;
	}

	
	/**
	 * Set the input last name to the person's last name.
	 * No validation required for input names.
	 * @param lastName
	 */
	public void setLastName(String lastName) {
			this.lastName = lastName;
	}

	
	/**
	 * If the input email is valid, assign it to the person's email; else prompt the user to input again.
	 * @param email
	 */
	public void setEmail(String email) {
		if (validateEmail(email)) {
			this.email = email;
		}
	}

	
	/**
	 * If the input SSN is valid, assign it to the person's SSN; else prompt the user to input again.
	 * @param ssn
	 */
	public void setSsn(String ssn) {
		if (validateSSN(ssn)) {
			this.ssn = ssn;
		}
	}


	/**
	 * If the input age is not valid, prompt the user to input again.
	 * @param age
	 */
	public void setAge(int age) {
		if (validateAge(age)) {
			this.age = age;
		}
	}

// ------------------------------------------------------------------------------------------------------------------------- //	
	
	
	
	
	

// ------------------------------(Private Static Validation Methods)-------------------------------------------------------- //	

	/**
	 * Validate email provided by user.
	 * @param email
	 * @return this method returns true or false based on the regex validation for the input email
	 */
	public static boolean validateEmail(String email) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		return Pattern.compile(regex).matcher(email).matches();
	}
	
	
	/**
	 * Validate age provided by user.
	 * @param age
	 * @return this method returns true or false based on the given condition for the input age
	 */
	public static boolean validateAge(int age) {
		return (age > 16);
	}
	
	
	/**
	 * Validate SSN provided by user.
	 * @param ssn
	 * @return this method returns true or false based on the regex validation for the input ssn
	 */
	public static boolean validateSSN(String ssn) {
		return Pattern.matches("^(\\d{3}-\\d{2}-\\d{4})", ssn);
	}
	
// ------------------------------------------------------------------------------------------------------------------------- //	

	
	
	
// ------------------------------ (INSTANCE METHODS) ----------------------------------------------------------------------- //	
	
	/**
	 * This method prints an instance of the Person class with the person's full name.
	 */
	public String toString() {
		if (getMiddleName() != "") {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
		else {
			return this.firstName + " " + this.lastName;
		}
	}
	
	
	/**
	 * Get the email domain of the user.
	 * @return this method returns the domain of the person's email address
	 */
	public String getEmailDomain() {
			return this.email.split("@")[1];
	}
	
	
	/**
	 * Get the last four digits of the user's SSN.
	 * @return this method returns the last four digits of the person's SSN
	 */
	public String getLast4SSN() {
			return this.ssn.split("-")[2];
	}
	
	/**
	 * This method displays the details of the class objects.
	 */
	public void display() {
		System.out.println('\n');
		System.out.println(this.getId());
		System.out.println(this.toString() + " (" + this.getClass().getSimpleName() + ")");
		System.out.println(this.getEmailDomain());
		System.out.println(this.getLast4SSN());
	}

}
