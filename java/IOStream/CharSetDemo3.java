package IOStream;

import java.io.FileReader;
import java.io.IOException;

public class CharSetDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\aaa\\a.txt");
        char[] chars = new char[2];
        int len;
        while ((len=fr.read(chars))!=-1) {
            System.out.print(new String(chars,0,len));
        }
        fr.close();

    }
}
