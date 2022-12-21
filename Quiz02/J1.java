import java.util.Scanner;

public class J1 {
    public static void main(String[] argv) {
        System.out.print("密碼輸入測試\n請輸入密碼：");

        Scanner sc = new Scanner(System.in);

        String passw0rd = sc.nextLine();

        for (int i = 0; i < 4; ++i) {
            if (i == 3)
                throw new RuntimeException("輸入三次錯誤！程式停止！");

            System.out.print("請再輸入一次密碼：");

            String tmp = sc.nextLine();

            if (tmp.equals(passw0rd)) {
                System.out.println("密碼正確");
                return;
            }

            else
                System.out.println("與第一次輸入的不同！");
        }

        sc.close();
    }
}