import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colce3 {
    public static void main(String [] args) {
        
        List <Integer> num = Arrays.asList(2,3,4,5,6);


        num.forEach(n ->  System.out.println(n)); 


        // int sum = 0;
        // for (int i =0; i< num.size(); i++) {
        //     int n = num.get(i);
        //     if (n %2 == 0) {
        //         n = n * 2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);

        // int sum = 0;
        // for (int n : num ) {
        //     if (n % 2 ==0) {
        //             n = n * 2;
        //                 sum = sum + n;
        //     }
        // }
        // System.out.println(sum);
    }
}
