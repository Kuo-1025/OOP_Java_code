class CShape {
    public double area() {
        return 0.0;
    }
}

class CCircle extends CShape {
    // (a)

    public double radius;

    public CCircle(double r) {
        radius = r;
    }

    public double area() {
        // Overriding area that it can return the area of circle.

        return radius * radius * 3.14;
    }
}

class CSquare extends CShape {
    // (b)

    public int side;

    public CSquare(int s) {
        side = s;
    }

    public double area() {
        // Overriding area that it can return the area of square.
        return side * side * 1.0;
    }
}

class CTriangle extends CShape {
    // (c)

    public int base, height;

    public CTriangle(int b, int h) {
        base = b;
        height = h;
    }

    public double area() {
        // Overriding area that it can return the area of circle.

        return base * height / 2.0;
    }
}

public class Class_11 {
    public static void main(String[] argv) {
        // (d)

        CCircle cir1, cir2;
        cir1 = new CCircle(321);
        cir2 = new CCircle(123);

        System.out.println("cir1.area() = " + cir1.area() + ", cir2.area() = " + cir2.area());

        CSquare squ1, squ2;
        squ1 = new CSquare(321);
        squ2 = new CSquare(123);

        System.out.println("aqu1.area() = " + squ1.area() + ", squ2.area() = " + squ2.area());

        CTriangle tri1, tri2;
        tri1 = new CTriangle(321, 123);
        tri2 = new CTriangle(654, 456);

        System.out.println("tri1.area() = " + tri1.area() + ", tri2.area() = " + tri2.area());

        double[] all_area = new double[6];

        all_area[0] = cir1.area();
        all_area[1] = cir2.area();
        all_area[2] = squ1.area();
        all_area[3] = squ2.area();
        all_area[4] = tri1.area();
        all_area[5] = tri2.area();

        largest(all_area);
    }

    public static void largest(double[] all_area) {
        /*
         * (e) Find the largest area of all object.
         * Yes, I think it's inconvenient.
         * I need to use a array to store,
         * then use for loop to compare each area to find the maxium.
         */

        double mx = -1.0;
        for (double val : all_area)
            mx = Math.max(mx, val);

        System.out.printf("The max area is %.2f\n", mx);
    }
}
