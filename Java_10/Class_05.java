class Caaa {
    private int num;

    public Caaa(int n) {
        num = n;
    }

    public int get() {
        return num;
    }
}

class Cbbb extends Caaa {
    public Cbbb(int n) {
        /*
         * Here also need to write a constructor and super to call the constructor in
         * parent class.
         */
        super(n);
    }

    public void show() {
        System.out.println("num = " + get());
    }
}

public class Class_05 {
    public static void main(String[] argv) {
        Cbbb bb = new Cbbb(2);
        /*
         * Because Cbbb is inherited from Caaa, when you call Cbbb(), it will check
         * Caaa(), but it only find Caaa(int n), so it tell you here is an error that
         * you need to have a argument when calling Cbbb().
         */
        bb.show();
    }
}