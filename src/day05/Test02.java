package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i+1);

        }

        for (Integer a:stack) {
            System.out.println(a);
        }


    }

}
