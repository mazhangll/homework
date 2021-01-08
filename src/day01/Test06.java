package day01;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Bonnie
 *
 */
public class Test06 {
	public static void main(String[] args) {
		String str = "23";
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入表达式");
		String s = scanner.nextLine();

		//int a = parseInt(str);
		int b = parseInt1(s);
		System.out.println(s+"="+b);
		
	}
	public static int parseInt(String str){
		// 最后要生成的数字
		int num = 0;
		// 临时变量，用于计算对应位数的数字
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			flag = (str.charAt(i) - 48);
			// 48 对应的0

			/*
			 * 这里是将对应的数字计算为对应的位，例如百位数字就要用该数字乘以10的2次方
			 * 得到
			 * 可以用Math的相关方法处理(自行查看API文档)
			 */


			for (int n = 0; n < str.length() - 1 - i; n++) {
				flag *= 10;
			}
			num += flag;
		}
		return num;
	}



public static int parseInt1(String str) {
	String s = "";
	String fuhao = "";
	int index = 0;
	int x = 0;
	int y = 0;
	for (int i = 0; i < str.length(); i++) {
		String str1 = (String) str.subSequence(i, i + 1);
		if (str1.matches("\\d")) {
			s += str1;
		} else {
			x = Integer.parseInt(s);
			s = "";
			index = i;
			fuhao = str1;
			break;
		}
	}
	for (int i = index; i < str.length(); i++) {
		String str1 = (String) str.subSequence(i, i + 1);
		if (str1.matches("\\d")) {
			s += str1;
		}
	}
	y = Integer.parseInt(s);
	switch (fuhao) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "/":
			try {
				return x / y;
			} catch (Exception e) {
				System.out.println("除数不能为0");
			}
		default:
			return 0;
	}
}}






