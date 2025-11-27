import java.util.Arrays;

/**
 * Represents a Person with personal information and family relationships.
 * Stores name, birth date, social security number, and maintains a list of siblings.
 */
public class Person {
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;  // Default value 0
    private Person[] siblings = new Person[0];  // Default empty array

    /**
     * Constructs a new Person with the specified personal information.
     * Siblings array starts empty and can be populated using addSibling().
     *
     * @param firstname the person's first name, cannot be null
     * @param lastname the person's last name, cannot be null
     * @param birthDay the day of birth (1-31)
     * @param birthMonth the month of birth (1-12)
     * @param birthYear the year of birth
     * @param ssn the social security number, cannot be null
     */
    public Person(String firstname, String lastname, int birthDay, 
                  int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    /**
     * Returns the person's first name.
     *
     * @return the first name
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the person's first name.
     *
     * @param firstname the new first name, cannot be null
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Returns the person's last name.
     *
     * @return the last name
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the person's last name.
     *
     * @param lastname the new last name, cannot be null
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the person's birthday in "day/month/year" format.
     *
     * @return the formatted birthday string
     */
    public String getBirthday() {
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    /**
     * Adds a sibling to this person's list of siblings.
     * Increases the sibling count and expands the siblings array.
     *
     * @param sibling the sibling to add, cannot be null
     */
    public void addSibling(Person sibling) {
        // Create a new array that's one size larger
        Person[] newSiblings = Arrays.copyOf(siblings, siblings.length + 1);
        
        // Add the new sibling to the end
        newSiblings[siblings.length] = sibling;
        
        // Replace the old array with the new one
        this.siblings = newSiblings;
        
        // Increase the sibling count
        this.numberOfSiblings++;
    }

    /**
     * Returns the array of siblings for this person.
     * Returns an empty array if no siblings have been added.
     *
     * @return the siblings array (may be empty)
     */
    public Person[] getSiblings() {
        return siblings;
    }

    /**
     * Returns the day of birth.
     *
     * @return the birth day (1-31)
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * Returns the month of birth.
     *
     * @return the birth month (1-12)
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * Returns the year of birth.
     *
     * @return the birth year
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Returns the social security number.
     *
     * @return the SSN
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Returns the number of siblings for this person.
     *
     * @return the sibling count
     */
    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }
}