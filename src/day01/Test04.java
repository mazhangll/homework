package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("please input String:");
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		String substring = next.substring(0, next.lastIndexOf("@"));
		System.out.println(substring);


	}
}
