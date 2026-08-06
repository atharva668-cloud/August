interface Computer {
    public abstract void laptop(); 
       
    
}
class Employe implements Computer {
    public void laptop () {
        System.out.println("Write, compile,run");
    }
}

class Att implements Computer{
    public void laptop () {
        System.out.println("Write, compile,run, Faster..");
    }
}

class developer  {
    public void DevApp(Computer  emp) {
        emp.laptop();
    }
}
public class Demo {
    public static void main(String []args ) {

        Computer emp = new Employe();
        Computer obj1 = new Att();

            developer obj = new developer();
            obj.DevApp(obj1);
    }
}
