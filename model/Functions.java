import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Functions {


    public static void main(String[] args) {
        // Create data for building owners
        Company company1 = new Company("Kiinteistö Oy", "Kiinteistöt", 300);
        Company company2 = new Company("Asunto Oy", "Kiinteistöt", 50);
        Person person1 = new Person("Aku Ankka", null, null, null, null, new Date(1980, 5, 2));

        // Create other person data
        List<Person> persons = new ArrayList();
        Person person2 = new Person("Mikki Hiiri", null, null, null, null, new Date(1985, 10, 13));
        Person person3 = new Person("Tupu Ankka", null, null, null, null, new Date(2003, 7, 7));
        persons.add(person2);
        persons.add(person3);
        persons.add(person1);

        // Create building data
        List<Building> buildings = new ArrayList<>();
        Building building1 = new Building("Helsinki", company1, 504.25, null, null, null);
        Building building2 = new Building("Helsinki", company2, 350.5, null, null, null);
        Building building3 = new Building("Helsinki", person1, 120.0, null, null, null);
        buildings.add(building1);
        buildings.add(building2);
        buildings.add(building3);

        // Report building data
        System.out.println("BUILDING INFORMATION:");
        System.out.println("Number of buildings: " + buildings.size());
        System.out.println("Number of company owned buildings: " + getCompanyOwnerCount(buildings));
        System.out.println();
        

        // Report Person data
        System.out.println("PERSON INFORMATION:");
        
        System.out.println("Persons before sort:");
        persons.forEach(person -> {
            System.out.println("Name: " + person.getName() + ", Date of birth: " + person.getBirthDate());
        });
        sortPersonsByYoungest(persons);
        System.out.println("Persons sorted:");
        persons.forEach(person -> {
            System.out.println("Name: " + person.getName() + ", Date of birth: " + person.getBirthDate());
        });

    }

    /**
     * Takes a list of Building-class objects and returns the number of them that are company owned
     * @param buildings List of Building-class objects to iterate over
     * @return Number of company owned buildings
     */
    public static Integer getCompanyOwnerCount(List<Building> buildings) {
        Integer count = 0;
        for (Building building : buildings) {
            if (building.isOwnedByCompany()) count++;
        }
        return count;
    }

    /**
     * Takes a list of Person-class objects and sorts them by their birth date from youngest to oldest
     * @param buildings List of Person-class objects to iterate over
     * @return List of Person-class objects starting from youngest
     */
    public static List<Person> sortPersonsByYoungest(List<Person> persons) {
        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
               return p2.getBirthDate().compareTo(p1.getBirthDate());
            }
         });
        return persons;
    }

}
