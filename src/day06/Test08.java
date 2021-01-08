package day06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        FileOutputStream o1 = new FileOutputStream("raf.dat",true);
        Integer a = new Integer();
        Long b = new Long();
        o1.write(Integer.MAX_VALUE);
        o1.write((int) b.MAX_VALUE);

        FileInputStream i1 = new FileInputStream("raf.dat");
        int read = i1.read();
        int read1 = i1.read();
        System.out.println(read);
        System.out.println(read1);

    }


}
