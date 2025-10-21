// Claudia Garcia 3137392

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        FriendGroup group = new FriendGroup(); // Create a FriendGroup to manage people

        // Create Person objects with names and birth dates
        Person p1 = new Person("Kieran", "McCarthy", LocalDate.of(1988, 2, 2));
        Person p2 = new Person("Anna", "Shumilova", LocalDate.of(1966, 3, 3));
        Person p3 = new Person("Flor", "Garza", LocalDate.of(1988, 11, 25));
        Person p4 = new Person("Jose", "Garcia", LocalDate.of(1993, 12, 20));
        Person p5 = new Person("Susana", "Garcia", LocalDate.of(1996, 11, 11));

        // Add these people to the FriendGroup
        group.add(p1);
        group.add(p2);
        group.add(p3);
        group.add(p4);
        group.add(p5);

        // Print all friends in the group
        System.out.println("All friends");
        System.out.println(group);

        // Search for a specific person (Flor)
        System.out.println("\nSearch for Flor");
        System.out.println(group.search(p3));

        // Get all people with the surname "Garcia"
        System.out.println("\nGet all by surname 'Garcia'");
        System.out.println(group.getAllBySurname("Garcia"));

        // Get all people born on a specific date
        System.out.println("\nGet all by DOB '1966-03-03'");
        System.out.println(group.getAllByDateOfBirth(LocalDate.of(1966, 3, 3)));

        // Sort the group by first name and print
        System.out.println("\nSort by First name: ");
        for (Person person : group.sort()) {
            System.out.println(person);
        }
    }
}
