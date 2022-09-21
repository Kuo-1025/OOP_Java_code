class Caaa {
    // Define a class -> Caaa.

    private int value;

    public Caaa() {
        // Define a constructor -> Caaa without arguments.

        this(10);
        /*
         * (a) Use "this()" with an argument to call constructor -> Caaa(int i) then set
         * value to i.
         */

        System.out.printf("value = %d\n", value);
    }

    public Caaa(int i) {
        // Define a consructor -> Caaa with an argument which named i.

        value = i;
        System.out.printf("value = %d\n", value);
    }
}

public class Class_03 {
    public static void main(String[] argv) {
        Caaa obj1 = new Caaa();
        /*
         * (b) It call constructor -> Caaa(),
         * then this() call constructor -> Caaa(int i).
         */

        Caaa obj2 = new Caaa(12);
        // (b) It call constructor -> Caaa(int i).

        // (c) No, a file just can have one public class.

        // (d) No, because value only be used in class Caaa.
    }
}
