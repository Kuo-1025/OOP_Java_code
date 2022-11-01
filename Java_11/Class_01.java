abstract class CShape {
    protected String color;

    public CShape(String c) {
        // Create a constructor to set color's value;

        color = c;
    }

    public abstract void show();
}

class CRectangle extends CShape {
    protected int width, height;

    public CRectangle(int w, int h) {
        super("Yellow");
        width = w;
        height = h;
    }

    public void show() {
        System.out.print("color=" + color + ",  ");
        System.out.println("area=" + width * height);
    }
}

class CCircle extends CShape {
    protected double radius;

    public CCircle(double r) {
        super("Green");
        radius = r;
    }

    public void show() {
        System.out.print("color=" + color + ",  ");
        System.out.println("area=" + radius * radius * 3.14);
    }
}

public class Class_01 {
    public static void main(String[] argv) {
        CRectangle rect = new CRectangle(5, 10);
        rect.show();

        CCircle cir = new CCircle(2.0);
        cir.show();
    }
}