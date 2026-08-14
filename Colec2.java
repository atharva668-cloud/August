import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Students {
    int marks;
    String name;

    Students(String name, int marks) {
        this.marks = marks;
        this.name = name;
    }

    void student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return ("marks"+ " :"+ marks  +  "  name" + ": " +  name);
    }
}
public class Colec2 {
    public static void main(String []args) {

        Comparator <Students> comp =(i,  j) -> i.marks > j.marks ? 1: -1;
        

        List <Students> stu = new ArrayList<>();
        stu.add(new Students("athava", 99));
        stu.add(new Students("sam", 95));
        stu.add(new Students("vedant", 45));
        stu.add(new Students("parth", 75));

        stu.sort(comp);
        System.out.println(stu);


    }
}
