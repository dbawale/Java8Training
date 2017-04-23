import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args){
        List<String> list = Arrays.asList("****","***","**");
        Collections.sort(list,(String s1, String s2) ->
            Integer.compare(s1.length(),s2.length()));

        for(String s : list){
            System.out.println(s);
        }
    }
}


//Anonymous class implementation
//Comparator<String> comp = new Comparator<String>() {
//    @Override
//    public int compare(String o1, String o2) {
//        return Integer.compare(o1.length(),o2.length());
//    }
//};
