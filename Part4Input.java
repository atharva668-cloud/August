import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part4Input {
    public static void main(String []args ) throws IOException {

        System.out.println("Enter the number :");
        int num = 0;
        BufferedReader in = null;

        try {
        
        in = new BufferedReader(new InputStreamReader(System.in)) ;   
        num = Integer.parseInt(in.readLine());
        System.out.println(num);
        } 

        finally {
            // System.out.println("finally..");
            in.close();
            
        }
    }
}
