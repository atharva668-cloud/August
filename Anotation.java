class A {
    public void showIsGreatAndVeryGreat() {
        System.out.println("In show  A");
    }
}

class B extends A {
    @Override                      // tells us about the method nameing details and accessing details
    public void showIsGreatAndVeryGreat() {
        System.out.println("in show B");
    }
}
class Anotation {
    public static void main(String [] args ) {

        A obj =  new A();
        obj.showIsGreatAndVeryGreat();
    }
}