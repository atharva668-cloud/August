class Student {
    private int marks ;
    private String name ;

    public Student () { // default constructor
        // System.out.println(marks + ": " + name);
    }

    public Student (int marks ,String name) { // parameterized constructor
        this.marks = marks;
        this.name = name;
    }


    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student(98,"Atharva");
        obj.setMarks(96);
        obj.setName("Atharva");
        System.out.println(obj.getName() + ": " + obj.getMarks() );
        System.out.println(obj1.getName() + ": " + obj1.getMarks() );
    }
}
