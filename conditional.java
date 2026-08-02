public class conditional {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        int c = 15;

        // if (a < b && a < c)
        //     System.out.println(a);
        // else if (b > a && b > c) {
        //     System.out.println(b);
        // }
        // else {
        //     System.out.println(c);
        // }
        

        // if (a < b || b > c)
        //     System.out.println(a);
        int result = 0;
        // result = a % 2 == 0 ? 10 : 20;   ternary operator
        // System.out.println(result);

        int n = 1;
        switch ( n ) {

        case 1 :
            if (n % 2 == 0)
            System.out.println("one");
            // break;
        case 2:
            System.out.println("two");
            // break;
        case 3:
            System.out.println("three");
            // break;
        case 4:
            System.out.println("four");
            // break;
        case 5:
            System.out.println("five");
            // break;
        case 6:
            System.out.println("Six");
            // break;
        case 7:
            System.out.println("Seven");
            // break;
        default :
            System.out.println("Invalid Number ");
        }
        
            


       
        
    }
}