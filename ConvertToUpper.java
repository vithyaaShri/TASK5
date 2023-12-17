
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpper{
    public static void main(String[] args) {
        List<String> list=Arrays.asList("hello","world");
        System.out.println(list);
        List<String> l=list.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(l);

    }
}