record Client(int id, String name) {
    public Client (int id, String name) {
        
        if (id == 0) 
            throw new  IllegalArgumentException( "Invalid input");
        this.id = id;
        this.name = name;
    }
} 


public class Recd {
    public static void main(String []args) {

        Client a1 = new Client(1, "Atharva");
        Client a2 = new Client(2, "Pralay");

        System.out.println(a1.name());
        System.out.println(a2);

    }
}


// Also kown as Conacial classes
