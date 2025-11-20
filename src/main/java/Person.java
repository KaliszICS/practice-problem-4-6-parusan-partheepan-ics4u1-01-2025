import java.util.Arrays;

public class Person {
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;  // Default value 0
    private Person[] siblings = new Person[0];  // Default empty array

    // Constructor - takes all values except numberOfSiblings and siblings
    public Person(String firstname, String lastname, int birthDay, 
                  int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    // Getters and setters for firstname and lastname
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Getter for birthday in "day/month/year" format
    public String getBirthday() {
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    // Add a sibling to the siblings array
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

    // Getter for siblings array
    public Person[] getSiblings() {
        return siblings;
    }

    // Additional getters for other fields (not required but useful)
    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getSsn() {
        return ssn;
    }

    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }
}