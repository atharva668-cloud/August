class AtharvaException extends Exception {
    public AtharvaException (String str){
        super(str);
    }

}
public class Part2Excep {
    public static void main(String []args) {
        int a = 20;
        int j = 0;

        try {
            j = 19 / a;
            if (j == 0) {
                throw new AtharvaException("Atharva Exception.." );
            }
        }
        catch (AtharvaException e) {
            System.out.println("cannot divide by zero" + e);
        }
        catch (Exception e) {
            System.out.println("Default calculation" + e);
        }
        System.out.println(j);
    }

}
