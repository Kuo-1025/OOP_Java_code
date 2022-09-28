public class Class_18 {
    public static void main(String[] argv) {
        CCircle cir = new CCircle(5);
        cir.show();
    }

    static class CCircle {
        // Define a class -> CCircle.

        public double pi = 3.14;
        public double radius;

        public CCircle(double r) {
            // Define a conctructor -> CCircle with an argument which named r.

            radius = r;
        }

        public void show() {
            // Print the area of the circle.

            System.out.printf("Area : %f\n", radius * radius * pi);
        }
    }
}
