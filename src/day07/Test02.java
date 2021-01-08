package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myfile.txt");
        BufferedInputStream src = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("myfile_cp2.txt");
        BufferedOutputStream desc = new BufferedOutputStream(fos);
        int d = -1;
        while((d = src.read())!=-1){
            desc.write(d);
        }
        src.close();
        desc.close();

    }

}
