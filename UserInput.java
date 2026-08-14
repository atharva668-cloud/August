import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String [] args) throws IOException {

        System.out.println("enter the number :");

        // InputStreamReader is = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(is);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // int result = Integer.parseInt(bf.readLine());
        System.out.println(num);

        sc.close();

    }
}

