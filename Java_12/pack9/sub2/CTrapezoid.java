package pack9.sub2;

public class CTrapezoid {
    // (c) Build CTrapezoid class

    int upper, base, height;

    public CTrapezoid(int u, int b, int h) {
        /*
         * (c) Build a constructor with three arguments, u, b,
         * and r,to set upper's, base's, and height's value.
         */

        upper = u;

        base = b;

        height = h;

    }

    public void show() {
        // (d) Build show() to print CTrapezoid's members and its area.

        System.out.println("upper = " + upper);

        System.out.println("base = " + base);

        System.out.println("height = " + height);

        System.out.println("area = " + ((upper + base) * height / 2) + "\r\n");

    }
}
