class CWin {
    int width, height;
    String name;

    void setW(int w) {
        width = w;
    }

    void setH(int h) {
        height = h;
    }

    void setName(String s) {
        name = s;
    }

    public void show() {
        System.out.printf("Name = %s\n", name);
        System.out.printf("W = %d, H = %d\n\n", width, height);
    }

    void setWindows(int w, int h) {
        width = w;
        height = h;
    }

    // Using overloading.
    void setWindows(int w, int h, String s) {
        width = w;
        height = h;
        name = s;
    }
}

public class Class12 {
    public static void main(String[] argv) {
        CWin cw1 = new CWin();
        cw1.setName("My 1st Windows");
        cw1.setW(5);
        cw1.setH(3);
        cw1.show();

        CWin cw2 = new CWin();
        cw2.setName("My 2nd Windows");
        cw2.setWindows(6, 8);
        cw2.show();

        CWin cw3 = new CWin();
        cw3.setWindows(48763, 36784, "My 3rd Windows");
        cw3.show();
    }
}
