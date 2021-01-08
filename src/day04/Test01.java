package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合c1，存放元素"one","two","three"
 * 再创建一个集合c2，存放元素"four","five","six"
 * 然后将c2元素全部存入c1集合
 * 然后在创建集合c3,存放元素"one,five"
 * 然后输出集合c1是否包含集合c3的所有元素
 * 然后将c1集合中的"two"删除后再输出c1集合
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        arr.add("one");
        arr.add("two");
        arr.add("three");
        System.out.println(arr);

        Collection<String> arr1 = new ArrayList<>();
        arr1.add("four");
        arr1.add("five");
        arr1.add("six");
        System.out.println(arr1);

        boolean b = arr.addAll(arr1);
        System.out.println(b);
        System.out.println(arr);

        Collection<String> arr3 = new ArrayList<>();
        arr3.add("one");
        arr3.add("five");

        boolean b1 = arr.containsAll(arr3);
        System.out.println(b1);


        boolean two = arr.remove("two");
        System.out.println(arr);
    }

}




