import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sorttop {
    public static void main(String []args) {
        // Collection <Integer> num = new ArrayList<>();
        
        // num.add(34);
        // num.add(89);
        // num.add(64);
        // num.add(56);

        // System.out.println(num);

        Map<String, Integer> num1 =  new HashMap<>();
        num1.put("Aksh", 88);
        num1.put("Yash", 78);
        num1.put("prakash", 54);
        num1.put("Sam", 89);
        num1.put("Sam", 99);

        // System.out.println(num1);

        for (String key : num1.keySet()) {
            System.out.println(key + " : " + num1.get(key));
        }
}
    }

