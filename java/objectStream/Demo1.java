package objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Student stu = new Student("张三", 23,"北京");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\aaa\\a.txt"));
        oos.writeObject(stu);
        oos.close();


    }
}
