package BufferedIOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\aaa\\a.txt"));

        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();


    }
}
