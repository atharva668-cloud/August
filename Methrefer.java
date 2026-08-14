import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Methrefer {
    public static void main(String [] args)  {

        List <String> str = Arrays.asList("Atharva","YAsh","Siddhi");
        List <String> result = str.stream()
            .map(String::toUpperCase)
            .toList();           // return method create variable

        System.out.println(result);    
 
    }
}
