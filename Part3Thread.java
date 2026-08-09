class Counter {
    int counter;
    public synchronized void A() {
        counter++;

    }
}
public class Part3Thread {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();


        Runnable obj =  () ->  {
        for (int i=0; i <=10000 ; i++) {
            c.A();
        }
        };
            
        
        Runnable obj1 = () -> {
        for (int i=0; i <=10000; i++) {
            c.A();
        }
    };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.counter);
    }
}