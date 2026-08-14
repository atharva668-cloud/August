@FunctionalInterface
interface A {
    void show(int i) ;
    // void show2();
}

// class  B implements A {
    // public void show() {
    //     System.out.println("in show A");
    // }
//  }  

public class Lambda {
    public static void main (String []args ) {

        A obj = (i) -> System.out.println("in show A" + i );   // lambda function

        obj.show(5);

    }
}
