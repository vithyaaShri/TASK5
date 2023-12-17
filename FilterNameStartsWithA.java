import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNameStartsWithA{
    public static void main(String[] args) {
        List<String> list=Arrays.asList("aaira","arjun","","bagiya","abisek","lalitha");
        System.out.println(list);
        List<String> l=list.stream().filter(i->i.startsWith("a")).collect(Collectors.toList());
        System.out.println(l);

    }
}
