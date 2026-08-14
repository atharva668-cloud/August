class Mobile {
    String brand ;
    int price;
    static String modal ;

    public Mobile(){
        String brand = "";
        int price = 340;
    }

    public void show () {
    System.out.println(modal + ": " + brand + ": " + price);
   }

   static {
    modal = "Iphone 14 pro max";
    System.out.println("Static block is invoked");
   }

}


public class Static {
    public static void main(String []args) throws ClassNotFoundException{

        // Mobile obj = new Mobile();
        // obj.brand = "Apple";
        // obj.price = 100000;
        // Mobile.modal = "Iphone 14 pro max";

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Samsung";
        // obj1.price = 100000;
        // Mobile.modal = "Iphone 14 pro max";

        Class.forName("Mobile");

        // obj.show();
        // obj1.show();
        

    }
}
