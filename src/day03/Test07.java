package day03;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        //创建一个存员工信息的集合
        Collection<Object> arr= new ArrayList<>();


        // 输入信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input personal data:");

        //name
        System.out.println("name:");
        String name = scanner.nextLine();

        //age
        System.out.println("age:");
        int age = scanner.nextInt();

        //gender
        System.out.println("gender:");
        String gender = scanner.next();

        //salary,
        System.out.println("salary:");
        int salary = scanner.nextInt();

        // hiredate
        System.out.println("hiredate:");
        Date hiredate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
        String format = simpleDateFormat.format(hiredate);


//        arr.add(name);
//        arr.add(age);
//        arr.add(gender);
//        arr.add(salary);
//        arr.add(hiredate);
        Emp e = new Emp(name, age, gender, salary, hiredate);

        //判断是否包含

        boolean check = arr.contains(e);
        if(check){
            System.out.println("该用户已存在");
        }else{
            arr.add(e);
        }

        //输出每个员工信息
        System.out.println(arr);
    }


    }



