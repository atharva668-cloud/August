import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Strm1 {
    public static void main(String[] args) {
        List <Integer> num = Arrays.asList(15,2,93,44,89,6);

        Predicate <Integer> pre =  n ->   n % 2 == 1;
            
        

        int result  = num.parallelStream()
        .filter(pre)
        .map(n -> n * 2)
        .sorted()
        .reduce(0, (c,e) -> c+e );
        // .forEach(n -> System.out.println(n));

        System.out.println(result);
        
    }
}