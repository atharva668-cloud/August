interface A {
    int show(int i,int j);
}

public class Ret {
    public static void main(String[]args) {

        A obj = (i , j ) ->  i + j;
    
        
        int result = obj.show(6,7);
        System.out.println(result);
    }
}
