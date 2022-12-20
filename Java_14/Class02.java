import java.util.Scanner; // Import related class which you need from Java class library.
import java.lang.String;

public class Class02 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        String res = sc.nextLine();

        sc.close();

        System.out.println(res.toUpperCase()); // Use toUpperCase() to convert res's value to uppercase.
    }
}