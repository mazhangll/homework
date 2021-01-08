package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        // ^[0-9]{2,3}[0-9]$
        String re = "^[0-9]{2,3}[0-9]-\\d{7,8}$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number:");
        String s = scanner.nextLine();
        boolean matches = s.matches(re);
        System.out.println(matches);
    }

}
