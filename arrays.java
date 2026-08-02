class user 
{
    int marks ;
    String name;
    int prn;
}
public class arrays{
    public static void main(String[]args) {

        // int array [] = {1,2,3,4};
        // System.out.println(array [0]) ;
        // System.out.println(array [1]) ;
        // System.out.println(array [2]) ;
        // System.out.println(array [3]) ;

        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array [i]) ;
        
        // int[] array1 = new int [4];
        // System.out.println(array1 [0]);
        // System.out.println(array1 [1]);
        // System.out.println(array1 [2]);
        // System.out.println(array1 [3]);

        // int array3 [] []  = new int [4] [5] ;
        // for (int i = 0; i <4 ; i++)
        //     {
        //         for (int j = 0; j < 5; j++)
        //         {
        //             array3[i][j] = (int)(Math.random() * 10);
            //         System.out.print(array3[i][j] + " ");
            //     }
            //     System.out.println();
            // }

            // for ( int n [] : array3) {
            //     for (int m : n) {
            //         System.out.print(m + " ");
            //     }
            //     System.out.println();
            // }

            // int user [][] = new int [3][];  // jagged array

            // user[0] = new int [2];
            // user[1] = new int [4];
            // user[2] = new int [3];
            
            // for (int i = 0; i <user.length ; i++)
            // {
            //     for (int j = 0; j < user[i].length; j++)
            //     {
            //         user[i][j] = (int)(Math.random() * 10);
            //         System.out.print(user[i][j] + " ");
            //     }
            //     System.out.println();
            // }

            user us = new user();
            us.marks = 95;
            us.name = "kumar";
            us.prn = 123;

            user us1 = new user();
            us1.marks = 97;
            us1.name = "akash";
            us1.prn = 1008;

            user us2 = new user();
            us2.marks = 80;
            us2.name = "ath";
            us2.prn = 12368;

            user u[] = new user[3];
            u[0] = us;
            u[1] = us1;
            u[2] = us2;

            // for (int i = 0; i < u.length; i++ ) {
            //     System.out.println(u[i].name +": "+ u[i].marks );
            // }

            for (user er : u) {
                System.out.println(er.name + " : " + er.marks);
            }


            // int nums [] = new int [4];
            // nums[0] = 10;       
            // nums[1] = 40;
            // nums[2] = 60;
            // nums[3] = 80;

            // for (int n : nums) {
            //     System.out.println(n);
            // }


        }


    }

