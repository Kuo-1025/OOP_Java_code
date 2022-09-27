class Namecard {
    private String name, address;
    private phone data;

    class phone {
        // (a) Define a class type -> phone with 2 members which named company, cell.

        String company, cell;

        public phone(String s1, String s2) {
            /*
             * (b) Define a constructor -> phone() with 2 arguments which named s1, s2
             * to set company to s1, and cell to s2.
             */

            company = s1;
            cell = s2;
        }
    }

    public Namecard(String Na, String Add, String S1, String S2) {
        name = Na;
        address = Add;

        data = new phone(S1, S2);
    }

    public void show() {
        // (c) Print all of the members in Namecard.

        System.out.println("好友姓名:" + name);
        System.out.println("聯絡地址:" + address);
        System.out.println("公司電話:" + data.company);
        System.out.println("手機號碼:" + data.cell);
    }
}

public class Class_17 {
    public static void main(String[] argv) {
        // (d)

        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");

        first.show();
    }
}
