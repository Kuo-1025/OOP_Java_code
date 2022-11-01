interface iVolume {
    public void showData();

    public double vol();
}

abstract class CSphere implements iVolume {
    final double PI = 3.14;
    protected int x, y;

    /*
     * (c)
     * 
     * protected int radius;
     * 
     * public void showData() {
     * // (a) Print all.
     * 
     * System.out.println("球心:(" + x + "," + y + ")");
     * System.out.println("半徑:" + radius);
     * System.out.println("球體積:" + vol());
     * }
     * 
     * public double vol() {
     * return (4 / 3.0) * PI * radius * radius * radius;
     * }
     */
}

class CCircle extends CSphere {
    protected int radius;

    public CCircle(int xx, int yy, int r) {
        x = xx;
        y = yy;
        radius = r;
    }

    public void showData() {
        // (a) Print all.

        System.out.println("球心:(" + x + "," + y + ")");
        System.out.println("半徑:" + radius);
        System.out.println("球體積:" + vol());
    }

    public double vol() {
        return (4 / 3.0) * PI * radius * radius * radius;
    }
}

public class Class_14 {
    public static void main(String[] argv) {
        CCircle cir = new CCircle(8, 6, 2);
        cir.showData();
    }
}

/*
 * (b)
 * 
 * Because CCircle inherits abstract class CSphere
 */
