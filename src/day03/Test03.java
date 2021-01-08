package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input time:");
        String s = scanner.nextLine();

        //将输入时间 字符串转化为date
        SimpleDateFormat sd = new SimpleDateFormat("yyy-MM-dd");
        Date parse = sd.parse(s);
        long time = parse.getTime();
        String format = sd.format(parse);
        System.out.println(parse);
        System.out.println(format);


        //当前时间
        Date date = new Date();
        long time1 = date.getTime();
        System.out.println(date);
        String format1 = sd.format(date);
        System.out.println(format1);
        // 周数计算
        long abs = Math.abs(time1 - time);
        int l = (int)(abs / (60 * 60 * 24 * 7 * 1000));
        System.out.println(l);

    }

}
