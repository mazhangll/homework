package day06;

import java.io.DataInput;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2017-06-30 14:22:16
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {

        File file = new File("myfile.txt");
        String name = file.getName();
        System.out.println(name);

        long length = file.length();
        System.out.println(length);

        long l = file.lastModified();
        System.out.println(l);

        Date date = new Date(l);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        String format1 = format.format(date);
        System.out.println(format1);


    }

}
