
class Calc {
    public int add (int num1,int num2) {
        return num1 + num2;
    }
}

class Advcal extends Calc {
    public int add(int num1,int num2) {
        return num1 + num2 + 10;
    }
}

public class MethodOverriding {
    public static void main(String [] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(5,6));
    }
}
