package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aaa\\a.txt");
        FileOutputStream fos = new FileOutputStream("F:\\aaa\\b.txt");

        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        fis.close();
        fos.close();

    }
}
