package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入时间
//        String time = scanner.nextLine();
       SimpleDateFormat s = new SimpleDateFormat("yyy-MM-dd");
//
//
//
//        Date parse = s.parse(time);
//        String format = s.format(parse);
//        System.out.println(format);
//
        Calendar t = Calendar.getInstance();
        System.out.println("输入日期：");
        t.set(scanner.nextInt(), scanner.nextInt(),scanner.nextInt());

        Date time = t.getTime();
        String format = s.format(time);
        System.out.println(format);


        System.out.println("输入天数：");
        int i = scanner.nextInt();
        t.add(Calendar.DATE, i);
        t.add(Calendar.DATE, -14);
        t.add(Calendar.DAY_OF_WEEK,4);
        Date time1 = t.getTime();
        String format1 = s.format(time1);
        System.out.println(format1);


    }


	
}
