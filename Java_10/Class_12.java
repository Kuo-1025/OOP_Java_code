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

public class Class_12 {
    public static void main(String[] argv) {
        // (d) Using array to store subclass object.

        CShape C_arr[] = new CShape[6];

        C_arr[0] = new CCircle(321);
        C_arr[1] = new CCircle(123);
        C_arr[2] = new CSquare(321);
        C_arr[3] = new CSquare(123);
        C_arr[4] = new CTriangle(321, 123);
        C_arr[5] = new CTriangle(456, 654);

        double[] all_area = new double[6];

        for (int i = 0; i < 6; ++i) {
            all_area[i] = C_arr[i].area();
        }

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
