package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {

        // 创建集合
        Collection<String> arr = new ArrayList<>();
        arr.add("one");
        arr.add("two");
        arr.add("three");

        //输出元素个数
        int size = arr.size();
        System.out.println(size);

        //是否包含“four”
        boolean four = arr.contains("four");
        System.out.println(four);

        //集合是否不含有任何元素
        boolean empty = arr.isEmpty();
        System.out.println(empty);

        //清空集合
        arr.clear();
        int size1 = arr.size();
        System.out.println(size1);
        boolean empty1 = arr.isEmpty();
        System.out.println(empty1);

//        int a = 2;
//        String s = a + "";
//        System.out.println(s);

    }

}
