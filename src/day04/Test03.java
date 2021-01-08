package day04;

import java.util.ArrayList;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("one");
        arr.add("two");
        arr.add("three");
        arr.add("four");
        System.out.println(arr);

        String s = arr.get(1);
        System.out.println(s);

        String set = arr.set(2, "3");
        System.out.println(arr);

        arr.add(2,"2");
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

    }

}
