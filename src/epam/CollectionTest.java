package epam;

// You are given a list of Person objects, each containing attributes name, age, and hobbies.
// Write a Java program using Stream API to find the top N most common hobbies among people aged
// between 20 and 30 (inclusive).
// Finally, return a list of unique hobbies sorted in descending order based on their frequency.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Person {

    String name;
    int age;
    List<String> hobbies;

    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}


public class CollectionTest {
    public static void main(String[] args) {
        Person person1 = new Person("Anant", 21, List.of("music", "reading"));
        Person person2 = new Person("Bindo", 33, List.of("gardening", "painting"));
        Person person3 = new Person("Rita", 25, List.of("reading", "sleeping", "painting"));
        Person person4 = new Person("Sindhu", 40, List.of("reading", "trekking"));

        List<Person> list = List.of(person1, person2, person3, person4);
        Map<String, Long> counts = list.stream()
                .filter(person -> person.age >= 20 && person.age <= 30)
                .map(Person::getHobbies)
                .flatMap(hobbies -> hobbies.stream())
                .collect(Collectors.groupingBy(hobby -> hobby,Collectors.counting()));
        System.out.println(counts.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed()));

    }
}
