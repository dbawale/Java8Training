import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) throws ClassNotFoundException{
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(2,4,6);
        List<Integer> list3 = Arrays.asList(3,5,7);

        List<List<Integer>> list = Arrays.asList(list1, list2, list3);

        list.forEach(System.out::println);

        Optional<Integer> i = list.stream()
                .map(List::size)
                .max(Comparator.naturalOrder());
//                .reduce(0, (a, b) -> a +b);
//                .flatMap(l -> l.stream())
//                .forEach(System.out::println);

        i.ifPresent(System.out::println);

        List<List<Integer>> emptyList = Arrays.asList();

        Integer j = emptyList.stream()
                .map(List::size)
                .max(Comparator.naturalOrder())
                .orElse(0);
//                .orElseThrow(ClassNotFoundException::new);
        System.out.println(j);
//j
    }
}
