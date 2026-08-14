// class -> class == extends
// interface -> interface == extends
// class -> interface == implements

interface  A {
    void show(); 
    int num = 10;
    String name = "Athex";           // interface can only store static and final method and variable
}

interface X {
    void config(); 

}

interface Y extends X {
    void run();
}

class B implements  Y{                 // uses only implements not extends
    public void show2 (){
        System.out.println("In show2");
    }

    public void show(){
        System.out.println("In show.. ");
    }

    public void config() {
        System.out.println("In config..");
    }

    public void run() {
        System.out.println("Running..");
    }
}
public class Inter {
    public static void main (String [] args) {
        B obj = new B();
        obj.show();
        obj.show2();
        obj.config();
        obj.run();
        System.out.println(A.name);
        System.out.println(A.num);
    }
}
