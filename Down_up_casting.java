class A {
    public void show1() {
        System.out.println("in show1");
    }
}
    
class B extends A {
        public void show2() {
            System.out.println("in show2");
        }
    }

public class Down_up_casting {
    public static void main(String [] args) {

        A obj = new B(); // upcasting
        obj.show1();

        B obj1 = (B) obj; // downcasting 
        obj1.show2();
    }
}
