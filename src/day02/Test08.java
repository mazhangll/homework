package day02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input name:");
        String s = scanner.nextLine();
        String re = ";";
        String[] split = s.split(re);
        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            for (int j = 0; j <s1.length() ; j++) {
                char c = s.charAt(j);
                System.out.println(c);
            }
            System.out.println(s1);
        }
        System.out.println(split[1]);
        Person person = new Person(split[0], Integer.parseInt(split[1]), split[2], Integer.parseInt(split[3]));
        String s1 = person.toString();
        System.out.println(s1);

        System.out.println(Arrays.toString(split));

        //System.out.println(s);

    }

}
