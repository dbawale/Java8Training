import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample
{
    public static void main(String[] args){

        Person[] personsArray = {
                new Person("A",45),
                new Person("B", 32),
                new Person("C", 23),
                new Person("D", 12),
                new Person("E", 22),
                new Person("F", 22)
        };

        List<Person> personList = Arrays.asList(personsArray);

//        personList.forEach(System.out::println);

        Stream<Person> stream = personList.stream();

        Person minAbove20 = stream.filter(person -> person.getAge()>=20)
                .min(Comparator.comparing(Person::getAge))
                .orElse(new Person("default", 0));

        System.out.println("min above 20 = " + minAbove20);

        Optional<Person> maxAgePerson = personList.stream()
                .max(Comparator.comparing(Person::getAge));

        System.out.println("Max age person" + maxAgePerson.get());

        Map<Integer, List<Person>> personAgeMap =
        personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println(personAgeMap);

        Map<Integer, Long> personAgeCount =
                personList.stream()
                        .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

        System.out.println(personAgeCount);

        Map<Integer, List<String>> personAgeName =
                personList.stream()
                        .collect(Collectors.groupingBy(Person::getAge,
                                Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(personAgeName);
    }
}
