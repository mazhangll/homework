package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input IP:");
            String s = scanner.nextLine();
            String re = "\\.";
            String[] split = s.split(re);
            for (int i = 0; i < split.length; i++) {
                System.out.print(split[i] + " ");

            }
            //System.out.println(Arrays.toString(split));
            System.out.println();
        }
    }
}
