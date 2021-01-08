package day04;

import java.util.*;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add((int)(Math.random()*10));

        }
        Object[] objects = list.toArray();
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));
        // 排序该集合

//        List<Object> objects = list;
//        Collections.sort(objects);
//        System.out.println(objects);


    }
}
