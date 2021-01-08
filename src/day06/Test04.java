package day06;

import java.io.File;
import java.util.Arrays;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        File file = new File(".");
        File[] files = file.listFiles();
        for (File a:files
        ) {
            System.out.println( a.getName());
        }
    }
	
}
