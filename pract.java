abstract class A {
    public abstract void show();
    public abstract void show1();

}
public class pract {
    public static void main(String []args) {

        A obj = new A() {
            public void show() {
                System.out.println("In show");
            }

            public void show1() {
                System.out.println("In show 1");
            }
        };
        obj.show();
        obj.show1();
    }
}
