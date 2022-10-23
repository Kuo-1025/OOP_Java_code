class CTriangle {
    protected int base, height;

    protected CTriangle(int b, int h) {
        // Create a constructor with two arguments b and h.

        base = b;
        height = h;
    }

    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}

class CData extends CTriangle {
    // (a) Create a class CData and inherits CTriangle.

    public CData(int b, int h) {
        /*
         * Create a constructor with two arguments b and h, and super to call the
         * constructor in parent class.
         */

        super(b, h);
    }

    public void area() {
        // (b) Call show() to print base and height, then print the area of triangle.

        super.show();
        System.out.printf("area=%.1f", base * height * 1.0 / 2);
    }

}

public class Class_06 {
    public static void main(String[] argv) {
        // (c)

        CData obj = new CData(3, 8);
        obj.area();
    }
}
