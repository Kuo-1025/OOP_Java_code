class Cal_area {
    public double pi = 3.14159;
    public double area = 0;

    public Cal_area(int tmp_r) {
        // Constructor with an argument.

        area = (4 * pi * tmp_r * tmp_r * tmp_r) / 3;

        // Print.
        System.out.printf("半徑 = %d\n", tmp_r);
        System.out.printf("球形體積 = %.1f\n\n", area);
    }

    public Cal_area(int x, int y, int z) {
        // Constructor with three arguments.

        area = (x * y + y * z + x * z) * 2;

        // Print.
        System.out.printf("長 = %d, 寬 = %d, 高 = %d\n", x, y, z);
        System.out.printf("立方體表面積 = %d\n", (int) area);
    }
}

public class Class01 {
    public static void main(String[] argv) {
        Cal_area ca1 = new Cal_area(10);
        Cal_area ca2 = new Cal_area(4, 5, 6);
    }
}