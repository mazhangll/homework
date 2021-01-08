package day05;

import day04.Emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。
 * 并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。按年龄
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入员工信息:");
        String input = scan.nextLine().trim();
        String[] infor = input.split(";"); //按分号分割
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<day04.Emp> list = new ArrayList<day04.Emp>();
        for(int i=0;i<infor.length;i++){
            String[] str = infor[i].split(",");
            String name = str[0];
            int age = Integer.parseInt(str[1]);
            String gender = str[2];
            int salary = Integer.parseInt(str[3]);
            Date hiredate = sdf.parse(str[4]);
            list.add(new Emp(name,age,gender,salary,hiredate));
        }


        //按时间排序
        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getHiredate().compareTo(o2.getHiredate());
            }
        });

        System.out.println("输出集合里面的员工信息:");
        for(Emp emp : list){
            System.out.println(emp.toString());
        }
    }

}
