class CWin {
    // (a) Define a class -> CWin.

    static int cnt = 0;
    // (a) Define a static variable and initialize it to 0.

    String color;
    int width, height;

    public CWin() {
        /*
         * (a) Define a constructor -> CWin.
         * While Creating an object, cnt plus one.
         * 
         * (c) Define a constructor -> CWin without any argument.
         * While calling it, set color to "Red", width to 2, height to 2.
         */

        ++cnt;

        color = "red";
        width = 2;
        height = 2;
    }

    public CWin(String str, int w, int h) {
        // Define a constructor -> Cwin with 3 arguments which named str, w, and h.

        color = str;
        width = w;
        height = h;
    }

    public void count() {
        // (a) Print the number of object.

        System.out.printf("cnt : %d", cnt);
    }

    public void setZero() {
        // (d) Set cnt's value to 0.

        cnt = 0;
        count();
    }

    public void setValue(int n) {
        // (e) Set cnt's value to n.

        cnt = n;
        count();
    }
}

public class Class_08 {
    public static void main(String[] argv) {
        CWin cw = new CWin();
        cw.count();
        cw.setZero();
        cw.setValue(48763);

        // (f) Static variable, because objects share it.
        // (e) Both.
    }
}
