package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {

        Collection<Object> arr = new ArrayList<>();
        arr.add("1");
        arr.add("$");
        arr.add("2");
        arr.add("$");
        arr.add("3");
        arr.add("$");
        arr.add("4");
        System.out.println(arr);

        Iterator<Object> iterator = arr.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(iterator.next());
            if(next.equals("$")){
                iterator.remove();
            }

        }
        System.out.println(arr);
        for (Object s:arr) {
            //arr.remove("$");
            System.out.println(s);

        }
        System.out.println(arr);


    }


}
