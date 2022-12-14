import java.util.Scanner;

class Exception520 extends Exception {
}

public class Class13 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        sc.close();

        try {
            is520(s);
        } catch (Exception520 e) {
            s = "這是由字串520所引起的例外";
        }

        System.out.println(s);
    }

    // Build is520(), and throws Exception520 if the value of string is "520".
    public static void is520(String s) throws Exception520 {
        if (s.equals("520"))
            throw new Exception520();
    }
}
