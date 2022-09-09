class CCircle {
    double area(double r) {
        return r * r * 3.14159;
    }

    float area(float r) {
        return r * r * 3.14159f;
    }

    double area(int r) {
        return r * r * 3.14159;
    }
}

public class Class13 {
    public static void main(String[] argv) {
        CCircle Area = new CCircle();
        System.out.println(Area.area(2));
        System.out.println(Area.area(2.2f));
        System.out.println(Area.area(2.2));
    }
}
