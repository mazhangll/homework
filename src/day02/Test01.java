package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {

        while(true){
            System.out.println("请输入一个字符串：");
            Scanner sc=new Scanner(System.in);

            String str=sc.nextLine();//存储输入的字符串
            String regexInteger="[0-9]*";//正则表达式用来判断是否是整数
            String regexDecimal="^\\d+\\.\\d+$";// 正则表达式用来判断是否是小数
            String regexnumber="-?[0-9]+.?[0-9]+";//是否为数字

            if(str.matches(regexInteger)) {//如果是整数
                int number1=Integer.parseInt(str); //将字符串转化为整形
                System.out.println(number1*10);  //处理的结果
            }

            if(str.matches(regexDecimal)) {
                double number2=Double.parseDouble(str);
                System.out.println(number2*5);
            }

            if(!str.matches(regexnumber)) {
                System.out.println("不是数字");
            }

}}
}



