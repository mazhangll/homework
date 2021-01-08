package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileInputStream i1 = new FileInputStream("myfile_cp.txt");



        FileOutputStream o1 = new FileOutputStream("myfile.txt");


        int i;
        while((i=i1.read()) != -1){
            o1.write(i);
        }
    }

}
