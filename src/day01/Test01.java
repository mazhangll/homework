package day01;

import javax.swing.*;

/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 * @author Bonnie
 *
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("-----------01-------------");
		String str = "HelloWorld";
		int length = test1(str);
		System.out.println("长度为"+length);
		//以下自行调用test2,test3...等方法。
		System.out.println("---------------02-------------");
		test02(str);
		System.out.println("--------------03--------------");
		test03(str);
		System.out.println("--------------04--------------");
		test04(str);
		System.out.println("--------------05--------------");
		test05(str);
		System.out.println("--------------06--------------");
		test06(str);
		System.out.println("--------------07--------------");
		test07(str);
		System.out.println("--------------08--------------");
		test08(str);
		System.out.println("--------------09--------------");
		test09(str);
//		System.out.println("dd");
//		System.out.println(04);

	}




	/*
	 * 以当前方法为例，下面继续编写test2,test3...等方法。
	 * 每个方法中实现类描述中的一个需求。
	 * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
	 * 
	 * test2实现:2:输出"HelloWorld"中"o"的位置
	 * 以此类推。
	 * @param str
	 */

	/**
	 * test1:输出字符串"HelloWorld"的字符串长度
	 * */
	public static int test1(String str){

		int length = str.length();
		return length;
	}

	 /**
	  * 2:输出"HelloWorld"中"o"的位置
	  * @mallz
	  * */
	private static void test02(String str) {

		int o = str.indexOf("o");
		for (int i = 0; i <str.length() ; i++) {
			char c = str.charAt(i);
			if(c=='o'){
				System.out.println("o的位置为："+i);
			}

		}

		//System.out.println("o的位置为："+ o);
	}

	/**
	 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置*/
	private static void test03(String str) {
		int o = str.indexOf("o", 5);

		System.out.println("从下标5出开始第一次出现\"o\"的位置:"+o);

	}


	/**
	 * 4:截取"HelloWorld"中的"Hello"并输出*/
	private static void test04(String str) {
		String substring = str.substring(0, 5);
		System.out.println(substring);

	}

	/**
	 * 5:截取"HelloWorld"中的"World"并输出*/
	private static void test05(String str) {
		String substring = str.substring(5);
		System.out.println(substring);
	}

	/**
	 * 6:将字符串"  Hello   "中两边的空白去除后输出*/
	private static void test06(String str) {
		String trim = str.trim();
		System.out.println(trim);

	}

	/** 7:输出"HelloWorld"中第6个字符"W"
	 *
	 */
	private static void test07(String str) {
		char c = str.charAt(5);
		System.out.println(c);
	}

	/** 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。*/
	private static void test08(String str) {
		boolean h = str.startsWith("h");
		boolean ld = str.endsWith("ld");
		System.out.println("以\"h\"开头:"+h);
		System.out.println("以\"ld\"结尾:"+ld);
	}


	/** 9:将"HelloWorld"分别转换为全大写和全小写并输出。*/
	private static void test09(String str) {
		String big = str.toUpperCase();
		String s = str.toLowerCase();
		System.out.println("大写"+big);
		System.out.println("小写"+s);
	}


}
