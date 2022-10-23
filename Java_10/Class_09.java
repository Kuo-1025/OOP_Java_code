class Caaa {
    private int num;

    public Caaa() {

    }

    public Caaa(int n) {
        num = n;
    }

    public int get() {
        return num;
    }

    public void display() {
        // (a)

        System.out.println("printed from Caaa class");
    }
}

class Cbbb extends Caaa {
    public Cbbb() {

    }

    public Cbbb(int n) {
        super(n);
    }

    public void show() {
        System.out.println("num = " + get());
    }

    public void display() {
        // (b)

        System.out.println("printed from Cbbb class");
    }
}

public class Class_09 {
    public static void main(String[] argv) {
        // (c) subclass's display() is called.

        Cbbb bb = new Cbbb();
        bb.display();
    }
}

/*
 * OUTPUT
 * printed from Cbbb class
 */