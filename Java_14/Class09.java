import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Class09 {
    public static void main(String[] argv) throws IOException {
        FileReader Fra = new FileReader("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\aaa.txt");
        FileReader Frb = new FileReader("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\bbb.txt");
        FileReader Frc = new FileReader("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\ccc.txt");

        BufferedReader Bra = new BufferedReader(Fra);
        BufferedReader Brb = new BufferedReader(Frb);
        BufferedReader Brc = new BufferedReader(Frc);

        String s = "";

        while ((s = Bra.readLine()) != null)
            System.out.println(s);

        while ((s = Brb.readLine()) != null)
            System.out.println(s);

        while ((s = Brc.readLine()) != null)
            System.out.println(s);

        Fra.close();
        Frb.close();
        Frc.close();
    }
}
