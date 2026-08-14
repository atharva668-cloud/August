import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Colec {
    public static void main(String []args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare (Integer i, Integer j) {
                if (i% 10 > j%10) 
                    return 1;
                else 
                    return -1;
            }
        };

        List <Integer>num = new  ArrayList<>(); {
            num.add(29);
            num.add(577);
            num.add(82);
            num.add(91);
        };
        Collections.sort(num,com);
        System.out.println(num);
       
        }
    }

