class CRectangle {
    protected int length, width;

    public CRectangle(int l, int w) {
        // (a)

        length = l;
        width = w;
    }
}

public class Class_19 {
    public static void main(String[] argv) {
        CRectangle rect = new CRectangle(2, 6); // (b)
        println(rect); // (c)
    }

    public static void println(CRectangle obj) {
        // (c)

        System.out.println("length=" + obj.length + ", width=" + obj.width + ", area=" + obj.length * obj.width);
    }
}
