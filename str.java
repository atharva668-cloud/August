public class str {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Atharva");
        sb.insert(6, "Java ");
        sb.reverse();
        System.out.println(sb);
        sb.length();
        // System.out.println(sb.length());
    }
}
