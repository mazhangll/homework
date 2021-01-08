package day05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {

    public static void main(String[] args) {
        Queue<Integer> objects = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            objects.add(i+1);
        }

        System.out.println(objects);

        //使用迭代器遍历
        Iterator<Integer> iterator = objects.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

    }
}
