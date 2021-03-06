package day04;


import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list);

        List<Integer> list1 = list.subList(3, 7);
        System.out.println(list1);

        //然后将子集元素扩大10倍
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i)*10);
        }

        System.out.println(list1);
        System.out.println(list);

        //之后删除集合中的[7,8,9]


        List<Integer> o = new ArrayList<>();
        o.add(7);
        o.add(8);
        o.add(9);
        list.removeAll(o);


        System.out.println(list);

    }

}
