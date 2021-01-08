package day02;

import java.util.Date;
import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input filename:");

		String s = scanner.nextLine();

		Date date = new Date();
		long time = date.getTime();
		//获取当前的系统时间
		long l = System.currentTimeMillis();
		System.out.println(l);

		String s1 = new String();
		String s2 = s1.valueOf(l);


		String substring = s.substring(0, s.indexOf("."));
		System.out.println(substring);

		String date1 = s.replace(substring, s2);
		System.out.println(date1);


	}
}
