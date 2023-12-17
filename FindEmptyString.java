import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEmptyString{
    public static void main(String[] args) {
        List<String> list=Arrays.asList("hello","world","","new");
        System.out.println(list);
        List<String> l=list.stream().filter(i->!i.isBlank()).collect(Collectors.toList());
        System.out.println(l);

    }
}

