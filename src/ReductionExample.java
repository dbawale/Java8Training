import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

    public static void main (String[] args){

        List<Integer> list = Arrays.asList(10, 20, 30);

       Integer red =
       list.stream()
                .reduce(0, Integer::sum);

       System.out.println("red=" + red);

       Optional<Integer> max = list.stream()
               .max(Comparator.naturalOrder());

       System.out.println("max=" + max.get());
    }
}