// Claudia Garcia 3137392

import java.time.LocalDate;

final class Person implements Comparable<Person> {
    private final String surname; // Last name of the person
    private final String firstname; // First name of the person
    private final LocalDate dateOfBirth; // Birth date of the person

    // Constructor to create a new Person
    public Person(String firstname, String surname, LocalDate dateOfBirth) {
        this.firstname = firstname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter for the last name
    public String getSurname() {
        return surname;
    }

    // Getter for the first name
    public String getFirstname() {
        return firstname;
    }

    // Getter for the date of birth
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Returns a string representation of the person
    public String toString() {
        return firstname + " " + surname + " " + dateOfBirth;
    }

    // Compare people by their first names (default sorting)
    public int compareTo(Person other) {
        return this.firstname.compareTo(other.firstname);
    }
}
