class A {
    public  void show () {

        System.out.println("In A");
    }   
}

class B extends A {
    public  void show() {
         System.out.println("In B");
    }
}

public class anoymous {
    public static void main(String [] args) {

        A obj =  new B()
        {
            public void show() {
                System.out.println("In A");
        }
        };
        obj.show();
    }
}
