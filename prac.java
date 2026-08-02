class claclulator {
     
    int a = 6;

    public int add(int n , int n1) {
        System.out.println(a);
        return n + n1 ;
    }
    public int add(int n , int n1,int n2) {
        return n + n1 + n2;
    }
    public int add(int n , int n1,int n5, int n6) {
        return n + n1 + n5 + n6;
    }
    

}
public class prac {
    public static void main(String []args) {

    
        claclulator obj = new claclulator();
        claclulator obj1 = new claclulator();
        System.out.println(obj1.add(8, 7));
        int result = obj.add(4, 7, 8,9);
        System.out.println(obj.a);

    }
}
