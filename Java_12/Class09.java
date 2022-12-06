import pack9.sub1.CSphere; // Import class CSphere which is in pack9.sub1
import pack9.sub2.CTrapezoid; // Import class CTrapezoid which is in pack9.sub2

public class Class09 {
    public static void main(String[] argv) {
        // (e) Test.

        CSphere CSp = new CSphere(69);
        CTrapezoid CTr = new CTrapezoid(48, 76, 3);

        CSp.show();
        CTr.show();
    }
}
