sealed class A extends Thread implements Cloneable permits B,C {

}
sealed class B extends A permits D {

}
non-sealed class C extends A {

}
non-sealed class D extends B{

}

sealed interface X permits Y{

}

sealed interface Y extends X {

}
final class Z implements Y {

}

public class Seal {
    public static void main(String [] args) {

    }
}