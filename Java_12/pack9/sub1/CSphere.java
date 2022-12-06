package pack9.sub1;

import java.lang.Math;

public class CSphere {
    // (a) Build Csphere class.

    double radius, PI = Math.PI;

    public CSphere(double r) {
        // (a) Build a constructor with an argument r to set radius's value.

        radius = r;

    }

    public void show() {
        // (b) Build show() to print radius and the sphere's volume.

        System.out.println("Radius = " + radius);

        System.out.println("Volume = " + (4.0 / 3 * PI * radius * radius * radius) + "\r\n");

    }
}
