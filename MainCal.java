public class MainCal {
    public static void main(String []args) {

        Veryadv obj = new Veryadv();

        int r1 = obj.add(10, 20);
        int r2 = obj.mul(10, 20);
        int r3 = obj.div(20, 10);  
        int r4 = obj.sub(20, 10);
        double r5 = obj.power(2,3); // This line will cause an error because power method is not defined in advCal class
        
        System.out.println(r1 + " " + r2 + " " + " " + r3 + " " + r4 + " " + r5);

    }
}
