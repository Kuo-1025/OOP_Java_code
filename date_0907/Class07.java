class CTest {
    void test(int n) {
        String res = n == 0 ? "此數為 0 \n" : n % 2 == 1 ? "此數為奇數\n" : "此數為偶數\n";
        System.out.print(res);
    }
}

public class Class07 {
    public static void main(String[] argv) {
        CTest q = new CTest();

        q.test(3);
        q.test(8);
        q.test(0);
    }
}
