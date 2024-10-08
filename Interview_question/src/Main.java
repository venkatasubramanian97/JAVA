import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Alice", 25)); // Added to show secondary sorting by name

        // Sort by age using Comparable
        Collections.sort(people);

        System.out.println("Sorted by age using Comparable:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort by name using Comparator
        Collections.sort(people, new NameComparator());

        System.out.println("\nSorted by name using Comparator:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

//output:
//	Sorted by age using Comparable:
//		Person{name='Bob', age=25}
//		Person{name='Alice', age=25}
//		Person{name='Alice', age=30}
//		Person{name='Charlie', age=35}
//
//		Sorted by name using Comparator:
//		Person{name='Alice', age=25}
//		Person{name='Alice', age=30}
//		Person{name='Bob', age=25}
//		Person{name='Charlie', age=35}
