class CCircle {
    double pi = 3.14, radius;

    void show_periphery() {
        System.out.printf("periphery = %.2f", this.pi * this.radius * 2);
    }
}

public class Class06 {
    public static void main(String[] argv) {
        CCircle cir1 = new CCircle();
        cir1.radius = 3.0;

        cir1.show_periphery();
    }
}
