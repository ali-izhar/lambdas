package v3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * This class creates three different instances of the class Person.
 * @author Izhar Ali
 *
 */
public class Driver {
	
	static HashMap<Long, Person> persons = new HashMap<Long, Person>();
	static String evaluatorType;
	
	/**
	 * The main method prompts the user for input and makes an instance of the class
	 * Person, Student, and Instructor respectively.
	 * @param args
	 */
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How should we evaluate? [Enter 'oldest' or 'youngest' or 'in their 20s']");		
		evaluatorType = sc.nextLine();
		
		while (!Person.evaluation.keySet().contains(evaluatorType)) {
			System.out.println("Invalid option, please enter a new one: ");
				evaluatorType = sc.nextLine();
		}
		
		Person person = makePerson(sc);
		persons.put(person.getId(), person);
		
		Student student = makeStudent(sc);
		persons.put(student.getId(), student);

		Instructor instructor = makeInstructor(sc);
		persons.put(instructor.getId(), instructor);
		
		display();
		sc.close();
	}
	
		
	/**
	 * This method creates a Person.
	 * @param sc
	 * @return return the newly created instance of the class Person
	 */
	private static Person makePerson(Scanner sc) {
		
		System.out.println("\nEnter person's first name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter person's middle name");
		String middleName = sc.nextLine();
		
		System.out.println("Enter person's last name");
		String lastName = sc.nextLine();
		
		System.out.println("Enter person's email address");
		String email = sc.nextLine();
		while (!Person.validateEmail(email)) {
			System.out.println("Invalid Email. Enter again:");
			email = sc.nextLine();
		}
		
		System.out.println("Enter person's SSN in ###-##-#### format");
		String ssn = sc.nextLine();
		while (!Person.validateSSN(ssn)) {
			System.out.println("SSN must contain 2 hyphens with ###-##-#### format:");
			ssn = sc.nextLine();
		}
		
		System.out.println("Enter person's age");
		String ageInput = sc.nextLine();
		int age = Integer.parseInt(ageInput);
		while(!Person.validateAge(age)) {
			System.out.println("Age should be greater than 16. Enter again:");
			ageInput = sc.nextLine();
			age = Integer.parseInt(ageInput);
		}
		if (age > Person.oldest) {
			Person.oldest = age;
		}
		if (age < Person.youngest) {
			Person.youngest = age;
		}
		
		
		Person person = new Person(firstName, middleName, lastName, email, ssn, age);
		return person;
	}
		
	
	/**
	 * This method creates a Student.
	 * @param sc
	 * @return return the newly created instance of the class Student inheriting from Person
	 */
	private static Student makeStudent(Scanner sc) {
		
		System.out.println("\nEnter student's first name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter student's middle name");
		String middleName = sc.nextLine();
		
		System.out.println("Enter student's last name");
		String lastName = sc.nextLine();
		
		System.out.println("Enter student's email address");
		String email = sc.nextLine();
		while (!Person.validateEmail(email)) {
			System.out.println("Invalid Email. Enter again:");
			email = sc.nextLine();
		}
		
		System.out.println("Enter student's SSN in ###-##-#### format");
		String ssn = sc.nextLine();
		while (!Person.validateSSN(ssn)) {
			System.out.println("SSN must contain 2 hyphens with ###-##-#### format:");
			ssn = sc.nextLine();
		}
		
		System.out.println("Enter student's age");
		String ageInput = sc.nextLine();
		int age = Integer.parseInt(ageInput);
		while(!Person.validateAge(age)) {
			System.out.println("Age should be greater than 16. Enter again:");
			ageInput = sc.nextLine();
			age = Integer.parseInt(ageInput);
		}
		if (age > Person.oldest) {
			Person.oldest = age;
		}
		if (age < Person.youngest) {
			Person.youngest = age;
		}
		
		System.out.println("Enter student's major");
		String major = sc.nextLine();
		
		Student student = new Student(firstName, middleName, lastName, email, ssn, age, major);
		return student;
	}
		
	
	/**
	 * This method creates an Instructor.
	 * @param sc
	 * @return return the newly created instance of the class Instructor inheriting from Person
	 */
	private static Instructor makeInstructor(Scanner sc) {
		
		System.out.println("\nEnter instructor's first name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter instructor's middle name");
		String middleName = sc.nextLine();
		
		System.out.println("Enter instructor's last name");
		String lastName = sc.nextLine();
		
		System.out.println("Enter instructor's email address");
		String email = sc.nextLine();
		while (!Person.validateEmail(email)) {
			System.out.println("Invalid Email. Enter again:");
			email = sc.nextLine();
		}
		
		System.out.println("Enter instructor's SSN in ###-##-#### format");
		String ssn = sc.nextLine();
		while (!Person.validateSSN(ssn)) {
			System.out.println("SSN must contain 2 hyphens with ###-##-#### format:");
			ssn = sc.nextLine();
		}
		
		System.out.println("Enter instructor's age");
		String ageInput = sc.nextLine();
		int age = Integer.parseInt(ageInput);
		while(!Person.validateAge(age)) {
			System.out.println("Age should be greater than 16. Enter again:");
			ageInput = sc.nextLine();
			age = Integer.parseInt(ageInput);
		}
		if (age > Person.oldest) {
			Person.oldest = age;
		}
		if (age < Person.youngest) {
			Person.youngest = age;
		}
		
		System.out.println("Enter instructor's department");
		String department = sc.nextLine();
		
		Instructor instructor = new Instructor(firstName, middleName, lastName, email, ssn, age, department);
		return instructor;
	}
		
	
	/**
	 * This method displays details about all the instances created above.
	 */
	private static void display() {
		for (Person person : persons.values()) {
			person.display();
			System.out.println(evaluatorType + ": " + Person.evaluation.get(evaluatorType).test(person));
		}
	}
}
