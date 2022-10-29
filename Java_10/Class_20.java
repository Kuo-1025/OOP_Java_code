class CRectangle {
    protected int length, width;

    public CRectangle(int l, int w) {
        length = l;
        width = w;
    }

    public String toString() {
        // (a)

        return "length=" + length + ", width=" + width + ", area=" + length * width;
    }

    public String toString(int a, int b) {
        // (b)

        if (a >= b)
            return this.toString();
        else
            return "Argument Error";
    }
}

public class Class_20 {
    public static void main(String[] argv) {
        CRectangle rect = new CRectangle(2, 6);

        System.out.println(rect);
        System.out.println(rect.toString(48763, 36784));
        System.out.println(rect.toString(36784, 48763));

        // (c) Overloading.
    }
}
