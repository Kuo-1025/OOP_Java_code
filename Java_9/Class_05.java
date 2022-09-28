class CCount {
    // (a) Define a class -> CCount.

    static int cnt = 0;
    // (a) Define a static variable and initialize it to 0.

    public CCount() {
        /*
         * (a) Define a constructor -> CCount.
         * While Creating an object, cnt plus one.
         */

        ++cnt;
    }

    public void count() {
        // (a) Print the number of object.

        System.out.printf("cnt = %d\n", cnt);
    }

    public void setZero() {
        // (b) Set cnt's value to 0.

        cnt = 0;
    }

    public void setValue(int n) {
        // (c) Set cnt's value to n.

        cnt = n;
    }
}

public class Class_05 {
    public static void main(String[] argv) {
        CCount c1 = new CCount(); // Create an object -> c1.
        System.out.print("c1.");
        c1.count();

        CCount c2 = new CCount(); // Create an object -> c2.
        System.out.print("c2.");
        c2.count();

        c1.setZero();
        System.out.print("c1.");
        c1.count();
        System.out.print("c2.");
        c2.count();

        c1.setValue(48763);
        System.out.print("c1.");
        c1.count();
        System.out.print("c2.");
        c2.count();

        // (d) Static variable, because objects share it.
        // (e) Both.
    }
}
