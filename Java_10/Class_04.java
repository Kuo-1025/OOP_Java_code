class CRectangle {
    private int length, width;

    public CRectangle() {
        /*
         * (a) Create a constructor without any argument, then set length and width to
         * 2.
         */

        length = 2;
        width = 2;
    }

    public CRectangle(int l, int w) {
        /*
         * (b) Create a constructor without two arguments, then set length and width to
         * l and w respectively.
         */

        length = l;
        width = w;
    }

    private void show() {
        System.out.println("length = " + length + ", width = " + width);
    }

    public int get_l() {
        /*
         * Because length is a private member, when I need to acess length in CData,
         * I can use this public function to get.
         */

        return length;
    }

    public int get_w() {
        /*
         * Because width is a private member, when I need to acess width in CData,
         * I can use this public function to get.
         */

        return width;
    }
}

class CData extends CRectangle {
    /*
     * (c) Create a class CData and inherited from CRectangle.
     */

    public CData() {
        super();
    }

    public CData(int l, int w) {
        /*
         * (c)Create a contructor with two argument a and b, and super to call the
         * constructor in CRetangle.
         */

        super(l, w);
    }

    public void area() {
        // Print length, width and the area of rectangle.

        int l, w;
        l = get_l();
        w = get_w();

        System.out.printf("length = %d\nwidth = %d\narea = %d\n\n", l, w, l * w);
    }
}

public class Class_04 {
    public static void main(String[] argv) {
        CData obj1 = new CData(3, 8);
        CData obj2 = new CData();
        obj1.area();
        obj2.area();
    }
}
