import java.io.FileReader; // Import related class which you need from java.io library.
import java.io.IOException;

public class Class04 {
    public static void main(String[] argv) throws IOException {
        FileReader Fr = new FileReader("C:\\Users\\user\\OneDrive\\文件\\GitHub\\OOP_Java_code\\Java_14\\donkey.txt");
        // Read the file.

        char info[] = new char[128];

        int res = Fr.read(info);
        /*
         * (a) First, put the character from the file into info[], then return its
         * length.
         */

        Fr.close();

        String s = "";
        for (char c : info)
            s += c;

        System.out.println("Total Charactor : " + res);
        System.out.println(s);
    }
}

/*
 * (b) 不一樣
 * 
 * 因為換行符號也是一種字元，
 * 在 windows 作業系統下的 Java，
 * 其讀取到的換行符號會是 "\r\n"。
 * 
 * 因此我們看到的雖然是
 * 
 * 我有一隻小毛驢
 * 我從來也不騎
 * 有一天我心血來潮騎著去趕集
 * 
 * 但對於 Java 來說卻是
 * 
 * 我有一隻小毛驢\r\n
 * 我從來也不騎\r\n
 * 有一天我心血來潮騎著去趕集
 */