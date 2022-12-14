import java.util.InputMismatchException;
import java.util.Scanner;

class IntegerTooSmall extends Exception {
}

class IntegerTooLarge extends Exception {
}

public class Class14 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        int n = 48763;
        String s = "";

        try {
            n = sc.nextInt(); // Here to check n is an integer or not.
            check(n);
        } catch (InputMismatchException e) {
            s = "您輸入的不是整數";
        } catch (IntegerTooSmall e) {
            s = "您輸入的整數的值太小";
        } catch (IntegerTooLarge e) {
            s = "您輸入的整數的值太大";
        }

        sc.close();

        System.out.println(s.length() == 0 ? n : s);
    }

    // Build check(), and throws exception.
    public static void check(int n) throws IntegerTooSmall, IntegerTooLarge {
        if (n < 10)
            throw new IntegerTooSmall();

        else if (n > 70)
            throw new IntegerTooLarge();

        else
            return;
    }
}
