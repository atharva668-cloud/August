class A {
    public A() {
        super();
        System.out.println("in A");
    }
    public A (int a) {
        super();
        System.out.println("in A with parameter: " );
    }
}
class B extends A{
    public B() {
        super();
        System.out.println("in B");
    }

    public B (int b) {
        this();
        System.out.println("in B with parameter: " );
    }
}
public class demo {

    public static void main(String [] args) {
        B b1 = new B(5);
    }
    
}
