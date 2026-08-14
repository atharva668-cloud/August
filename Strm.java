import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Strm {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2, 3, 4, 5, 6, 7);

        // Predicate<Integer> per = n -> n % 2 == 0;

        // num.stream()
        //     .map(n -> n * 2)
        //     .filter(n -> n % 2 == 0);

        Stream <Integer> SortedValues = num.stream()
                        .filter(n -> n % 2 ==0)
                        .sorted();
                        
                SortedValues.forEach(n -> System.out.println(n));
    }
}


// public class Strm {
//     public static void main(String[] args) {

//         List<Integer> num = Arrays.asList(2, 3, 4, 5, 6, 7);

//         Stream<Integer> SortedValues = num.stream()
//                 .filter(n -> n % 2 == 0)
//                 .sorted();

//         SortedValues.forEach(n -> System.out.println(n));
//     }
// }