package streams;

import java.util.List;
import java.util.ArrayList;

/**
 * This class represents a celebrity who would own a pet.
 * @author Izhar Ali
 * @version 2021.12.07
 */
public class Celebrity {
	public String fname;
	public String lname;
	public List<Pet> pets = new ArrayList<Pet>();
	
	/**
	 * Give the celebrity a first and last name.
	 * @param fname the firstname of the celebrity.
	 * @param lname the lastname of the celebrity.
	 */
	public Celebrity(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	/**
	 * List of pets that the celebrity owns.
	 * @return the list of pets.
	 */
	public List<Pet> getPets() {
		return pets;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public void addPet(Pet p) {
		pets.add(p);
	}
	
	/**
	 * Print the celebrity with the list of pets.
	 */
	public String toString() {
		return fname + " " + lname + " " + pets.toString();
	}
}
