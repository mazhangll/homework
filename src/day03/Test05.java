package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号 码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        //41152619950308383X
        //输入身份证号
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input id:");
        String s = scanner.nextLine();
        //获取年份
        String substring1 = s.substring(6, 10);
        //获取月份
        String substring2 = s.substring(10, 12);
        //获取日期
        String substring3 = s.substring(12, 14);


        String substring = s.substring(6, 14);
        System.out.println(substring);

        Calendar time = Calendar.getInstance();
        time.set(Integer.parseInt(substring1),Integer.parseInt(substring2),Integer.parseInt(substring3));
        time.add(Calendar.YEAR, 20);
        time.add(Calendar.DAY_OF_WEEK,4);
        Date time1 = time.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
        String format = simpleDateFormat.format(time1);
        System.out.println(format);


    }

}
