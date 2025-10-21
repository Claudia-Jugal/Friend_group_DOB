// Claudia Garcia 3137392

import java.time.LocalDate;
import java.util.*;

public class FriendGroup {
    private final Set<Person> friends = new HashSet<>(); // Store unique friends

    // Add a new person to the group
    public void add(Person person) {
        if (person == null) {
            throw new NullPersonException("Person cannot be null"); // Custom exception for null input
        }
        friends.add(person);
    }

    // Check if a person is in the group
    public boolean search(Person person) {
        if (person == null) {
            throw new NullPersonException("Person cannot be null");
        }
        return friends.contains(person); // Returns true if the person exists
    }

    // Get all people in the group
    public Set<Person> getAll() {
        return new HashSet<>(friends); // Return a copy to avoid external modification
    }

    // Get all people with a specific last name
    public Set<Person> getAllBySurname(String surname) {
        Set<Person> result = new HashSet<>();
        for (Person person : friends) {
            if (person.getSurname().equalsIgnoreCase(surname)) {
                result.add(person);
            }
        }
        return result;
    }

    // Get all people with a specific first name
    public Set<Person> getAllByFirstname(String firstname) {
        Set<Person> result = new HashSet<>();
        for (Person person : friends) {
            if (person.getFirstname().equalsIgnoreCase(firstname)) {
                result.add(person);
            }
        }
        return result;
    }

    // Get all people born on a specific date
    public Set<Person> getAllByDateOfBirth(LocalDate date) {
        Set<Person> result = new HashSet<>();
        for (Person person : friends) {
            if (person.getDateOfBirth().equals(date)) { // Match exact date
                result.add(person);
            }
        }
        return result;
    }

    // Remove a person from the group
    public boolean remove(Person person) {
        return friends.remove(person); // Returns true if successfully removed
    }

    // Sort people by their first names
    public List<Person> sort() {
        List<Person> sortedList = new ArrayList<>(friends);
        Collections.sort(sortedList); // Use Person's compareTo method
        return sortedList;
    }

    // Sort people using a custom comparator
    public List<Person> sort(Comparator<Person> comparator) {
        List<Person> sortedList = new ArrayList<>(friends);
        sortedList.sort(comparator); // Sort using the provided comparator
        return sortedList;
    }

    // Returns a string representation of all people in the group
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person person : friends) {
            sb.append(person.toString()).append("\n");
        }
        return sb.toString();
    }
}
