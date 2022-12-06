import pack6.subpack1.CCircle; // Import class CCircle which is in pack6.subpack1
import pack6.subpack2.CRectangle; // Import class CRectangle which is in pack6.subpack1
import pack6.subpack1.subsubpack.Cstyle; // Import class Cstyle which is in pack6.subpack1.subsubpack

public class Class08 {
    public static void main(String[] argv) {

        CCircle Cir = new CCircle();
        CRectangle CRect = new CRectangle();
        Cstyle Cst = new Cstyle(1);

        Cir.show();
        CRect.show();
    }
}