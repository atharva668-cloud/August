class A {
    public void show() throws ClassNotFoundException {
        Class.forName("calc");
    }
}
public class part3Excep {
    static {
        System.out.println("throws..");
    }
    public static void main (String []args ) {
        A obj = new A();
        // obj.show();
    }
}
