class CSphere {
    private int x, y, z, radius;

    void setLocation(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    void setRadius(int r) {
        radius = r;
    }

    double surfaceArea() {
        return 4 * 3.14159 * radius * radius;
    }

    double volume() {
        return 4 * 1.0 / 3 * 3.14159 * radius * radius * radius;
    }

    void showCenter() {
        System.out.printf("(%d, %d, %d)\n", x, y, z);
    }
}

public class Class16 {
    public static void main(String[] argv) {
        CSphere sphere = new CSphere();
        sphere.setLocation(3, 4, 5);
        sphere.setRadius(1);
    }
}
