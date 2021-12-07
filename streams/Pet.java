package streams;

/**
 * Pet is a generic class representing a pet.
 * @author Izhar Ali
 * @version 2021.12.07
 */
public class Pet {

	private String name;
	private int ageInMonths;
	
	/**
	 * Give the pet a name and age in months.
	 * @param name the name of the pet.
	 * @param ageInMonths the age of the pet in months.
	 */
	public Pet(String name, int ageInMonths) {
		this.name = name;
		this.ageInMonths = ageInMonths;
	}
	
	
	/**
	 * Get the name of the pet.
	 * @return the pet's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the age of the pet.
	 * @return the pet's age.
	 */
	public int getAgeInMonths() {
		return ageInMonths;
	}

	/**
	 * Print the pet with formatted details.
	 */
	public String toString() {
		return this.getClass().getSimpleName() + " " + this.name + " (" + this.ageInMonths + " months)";
	}
	
}