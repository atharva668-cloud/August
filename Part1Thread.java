class A extends Thread {
    public void run() {
        for (int i = 0; i<=100 ; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread  {
        public void run() {
        for (int i = 0; i<=100 ; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
class Part1Thread {
    public static void main(String []args ) {

        A obj = new A();
        B obj1 = new B();

        obj.start();
         try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        obj1.start();
         try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        
    }
}