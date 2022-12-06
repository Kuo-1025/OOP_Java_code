import pack6.subpack1.CCircle;
import pack6.subpack2.CRectangle;
import pack6.subpack1.subsubpack.Cstyle;

public class Class08 {
    public static void main(String[] argv) {

        CCircle Cir = new CCircle();
        CRectangle CRect = new CRectangle();
        Cstyle Cst = new Cstyle(1);

        Cir.show();
        CRect.show();
    }
}