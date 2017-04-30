import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstPredicates {

    public static void main(String[] args){
//        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        List<String> stringList = Arrays.asList("one", "two", "three", "four", "five");
        Stream<String> stream = stringList.stream();

//        Predicate<String> p2 = Predicate.isEqual("two");

        stream
                .filter(Predicate.isEqual("two").or(Predicate.isEqual("three")))
                .forEach(System.out::println);

        stream = stringList.stream();
        List<Integer> lengths = stream.map(String::length)
                .collect(Collectors.toList());
        lengths.forEach(System.out::println);

        stringList
                .stream()
                .map(p -> p.endsWith("e"))
                .forEach(System.out::println);

//        stringList
//                .stream()
//                .map(s -> s.concat("db"))
//                .forEach(System.out::println);

    }
}
