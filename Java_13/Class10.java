class RadiusTooLarge extends Exception {
}

class RadiusIsNegative extends Exception {
}

class CCircle {
    private double radius;

    public void setRadius(double r) throws RadiusTooLarge, RadiusIsNegative {
        if (r > 100) {
            throw new RadiusTooLarge(); // throw RadiusTooLargeException
        } else if (r < 0) {
            throw new RadiusIsNegative(); // throw RadiusIsNegativeException
        } else
            radius = r;
    }

    public void show() {
        System.out.println("area=" + 3.14 * radius * radius);
    }
}

public class Class10 {
    public static void main(String args[]) {
        CCircle cir = new CCircle();
        try {
            cir.setRadius(48763);
        } catch (RadiusTooLarge e) { // catch the exception thrown by setRadius .
            System.out.println(e + " throwed");
        } catch (RadiusIsNegative e) { // catch the exception thrown by setRadius .
            System.out.println(e + " throwed");
        }
        cir.show();
    }
}

/*
 * app13_8 OUTPUT-----------
 * CCircleException throwed
 * area=0.0
 * --------------------------
 */