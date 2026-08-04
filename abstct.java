abstract class Car {
    public abstract void drive ();
    {

    }

    public void music() 
    {
        System.out.println("Music is playing..");
    }

    public abstract void fly(); {

    }
}

abstract class Bugati extends Car {

    public abstract void drive (); {
        System.out.println("Car is running");
    }

    public void fly () {
        System.out.println("flying..");
    }
}

class Final extends Bugati {
    public void drive ()
    {
        System.out.println("Car is running..");
    }
}
public class abstct {
    public static void main(String [] args) {

        Final obj = new Final();
        obj.drive();
        obj.music();
        obj.fly();

    }
}
