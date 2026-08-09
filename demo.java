// Exception handling in java 
public class Demo {
    public static void main(String []args) {
        int a = 12;
        int b = 0;
        int num [] = new int[5];
        String str =  null;

        try 
        {
            System.out.println(str.length());
            System.out.println(num[5]);
            System.out.println(a /  b);
        }

        catch (NullPointerException e) {
            System.out.println("Invalid Details." + e);
        }

        catch (ArithmeticException e ) {
            System.out.println("Cant't divided by zero" + e);
        }

        catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Stay in your limit" + e);
        }

        catch (Exception e) 
        {
            System.out.println("Something Went Wrong.." + e );
        }

        System.out.println(a);
        System.out.println("Hey.. !");

    }
}
