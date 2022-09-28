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
}

public class Class_15 {
    public static void main(String[] argv) {
        CCircle cir[] = new CCircle[3];

        cir[0] = new CCircle(1.0);
        cir[1] = new CCircle(4.0);
        cir[2] = new CCircle(2.0);

        System.out.println("Largest radius = " + CCircle.compare(cir));
        System.out.println("Average = " + CCircle.average(cir));
    }
}
