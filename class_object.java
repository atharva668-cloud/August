 
// class Calclulator {
//     public int add (int num1, int num2) {
//         int result = num1 + num2;
//         return result;
//     }
// }

class gift {
    public String pen(int cost) {
        if (cost >= 10) {
            return "pen" ;
        }
        else 
            {
            return "Nothing";
        }

        }
    }

class Music {
    public void ms () {
        System.out.println("Music is Playing..");
    }
}


public class class_object {
    public static void main(String []args){
        
       gift obj = new gift();
       System.out.println(obj.pen(56));

       Music obj1 = new Music();  
       obj1.ms();

    }
}