import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Opt {
    public static void main(String []args) {
        List<String> str = Arrays.asList("yash", "Aditya", "xl ");

        Optional <String > re = str.stream()
            .filter(n -> n.contains("x"))
            .findFirst();
           
            

        System.out.println(re.orElse("Not Found"));
    }
}
