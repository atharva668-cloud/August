class Wrapper{
    public static void main(String[] args) {
        
        int num = 12;
        Integer num2 = num;  // Autoboxing    Integer is object class & int is primitive class
        System.out.println(num2);

        int num3 = num2;
        System.out.println(num3);  // Autounboxing

        // int num = 12;
        // Integer num2 = new Integer(num);  // Boxing 
        // System.out.println(num2);


        String str = "24";
        int num1 = Integer.parseInt(str);
        System.out.println(num1 * 2);
    }
}