package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long[] t = new long[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("please input date1:");

            Date parse = dateFormat.parse(scanner.nextLine());
            t[i]  = parse.getTime();

        }
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
        Date[] dates = new Date[3];
        for (int i = 0; i <t.length ; i++) {
            dates[i] = new Date(t[i]);
            String format = dateFormat.format(dates[i]);
            System.out.println(format);
        }



//        System.out.println(Arrays.toString(t) );
//        List<Object> objects = new ArrayList<>();
//        for (int i = 0; i < t.length; i++) {
//            objects.add(t[i]);
//        }
//
//        System.out.println(objects);





    }

}
