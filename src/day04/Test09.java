package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;
 * 李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入员工信息:");
        String input = scan.nextLine().trim();
        String[] infor = input.split(";"); //按分号分割
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Emp> list = new ArrayList<Emp>();
        for(int i=0;i<infor.length;i++){
            String[] str = infor[i].split(",");
            String name = str[0];
            int age = Integer.parseInt(str[1]);
            String gender = str[2];
            int salary = Integer.parseInt(str[3]);
            Date hiredate = sdf.parse(str[4]);
            list.add(new Emp(name,age,gender,salary,hiredate));
        }
        System.out.println("输出集合里面的员工信息:");

        for(Emp emp : list){
            System.out.println(emp.toString());
        }
        for(Emp emp : list){
            Date date = emp.getHiredate();
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.MONTH, 3);
            c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            date = c.getTime();
            String outdate = sdf.format(date);
            System.out.println(emp.getName()+"的转正日期是:"+outdate);
        }
    }

}
