package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        String[] str = {"one","two","three"};
        System.out.println(Arrays.toString(str));

        //该数组转换为一个List集合
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        System.out.println(list);




    }

}
