package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入信息:");
        String input = scanner.nextLine().trim();
        String[] str = input.split(";"); //按分号分割
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String[] split = str[i].split(":");
            String kemu = split[0];
            int grade = Integer.parseInt(split[1]);
            map.put(kemu, grade);
            //System.out.println(str[i]);
        }
        System.out.println(map);
        
        
        //输出物理的成绩。
        Integer wuli = map.get("物理");
        System.out.println(wuli);

        //将化学的成绩设置为96
        map.put("化学", 96);
        System.out.println(map);
        //删除英语这一项。
        map.remove("英语");

        System.out.println(map);

        //然后遍历该Map分别按照遍历key，Entry，value的形式输出该Map信息。
        Set<String> strings = map.keySet();
        for (String kemu: strings) {
            System.out.println(kemu);
        }
        

        Collection<Integer> values = map.values();
        for (Integer i: values) {
            System.out.println(i);
        }
        

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String ,Integer> key: entries
             ) {
            System.out.println(key.getKey()+":"+key.getValue());
        }


    }

}
