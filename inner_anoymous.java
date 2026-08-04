class A {

    int num;

    public void show () {
        System.out.println("In A");
    }

    static class B {
        public void show2() {
            System.out.println("In show B");
        }
    }
}
public class inner_anoymous {
    public static void main (String [] args) {
        
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.show2();
    }
}



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


