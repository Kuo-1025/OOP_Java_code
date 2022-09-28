class CCircle {
    private static double pi = 3.14;
    private double radius;

    public CCircle(double r) {
        radius = r;
    }

    public static double compare(CCircle c[]) {
        double max = 0.0;

        for (int i = 0; i < c.length; ++i)
            max = c[i].radius > max ? c[i].radius : max;

        return max;
    }

    public static double average(CCircle c[]) {
        // Calculate the average of all the radius in object array, then return.

        int total = 0;

        for (int i = 0; i < c.length; ++i)
            total += c[i].radius;

        return total * 1.0 / c.length;
    }

    public void show() {
        // Print the input and each object's area.

        System.out.printf("Radius = %.1f, Area = %.2f\n", radius, pi * radius * radius);
    }
}

public class Class_16 {
    public static void main(String[] argv) {
        CCircle cir[] = new CCircle[5];

        for (int i = 0; i < 5; ++i) {
            // Use for loop to input data.

            cir[i] = new CCircle(i * 1.0);

            System.out.printf("cir[%d] : ", i);
            cir[i].show();
        }

        System.out.println("Largest radius = " + CCircle.compare(cir));
        System.out.println("Average = " + CCircle.average(cir));
    }
}
