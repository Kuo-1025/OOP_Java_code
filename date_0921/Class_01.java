class CRectangle {
    int width, height;

    public CRectangle(int w, int h) {
        // (a) define constructor -> CRectangle and arguments are w, h.

        width = w;
        height = h;
    }

    public CRectangle() {
        // (b) Define constructor -> CRectangle and no argument.

        width = 10;
        height = 8;
    }

    /*
     * public CRectangle() {
     * 
     * (c) Define constructor -> CRectangle and no argument, but using "this()" to
     * initialize your width and height.
     * 
     * 
     * this(10,8);
     * }
     */

    void show_value() {
        // Print width and height.
        System.out.printf("width = %d, height = %d\n", width, height);
    }
}

class Class_01 {
    public static void main(String[] argv) {
        CRectangle CR = new CRectangle(234, 48763); // Create an object -> CR.
        CR.show_value();

        CRectangle cr = new CRectangle(); // Create an object -> cr.
        cr.show_value();
    }
}