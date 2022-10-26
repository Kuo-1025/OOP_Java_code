class CWin {
    int width, height;
    String name;

    public CWin(int w, int h, String s) {
        // Using overloading.
        width = w;
        height = h;
        name = s;
    }

    /*
     * void setW(int w) {
     * width = w;
     * }
     */

    /*
     * void setH(int h) {
     * height = h;
     * }
     */

    /*
     * void setName(String s) {
     * name = s;
     * }
     */

    public void show() {
        System.out.printf("Name = %s\n", name);
        System.out.printf("W = %d, H = %d", width, height);
    }

    void setWindows(int w, int h) {
        width = w;
        height = h;
    }
}

public class Class12 {
    public static void main(String[] argv) {
        CWin cw = new CWin(5, 3, "My Windows");

        /*
         * cw.setName();
         * cw.setW(5);
         * cw.setH(3);
         */

        cw.show();
    }
}
