import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Class08 {
    public static void main(String[] argv) throws IOException {
        FileReader Fra = new FileReader("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\aaa.txt");
        FileReader Frb = new FileReader("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\bbb.txt");

        BufferedReader Bra = new BufferedReader(Fra);
        BufferedReader Brb = new BufferedReader(Frb);

        FileWriter Fwc = new FileWriter("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\ccc.txt");
        BufferedWriter Bwc = new BufferedWriter(Fwc);

        String s = "";

        while ((s = Bra.readLine()) != null) {
            Bwc.write(s + "\r\n");
        }

        while ((s = Brb.readLine()) != null) {
            Bwc.write(s + "\r\n");
        }

        Bwc.flush();

        Fra.close();
        Frb.close();
        Fwc.close();
    }
}
