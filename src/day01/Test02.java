package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
//		System.out.println(84);
//		System.out.println(44);
//		System.out.println(9);
//		String str = "大家好!";
//		System.out.println("-----输出1------------");
//		//test01(str);
//		//str = str+"我是程序员!";
//		String concat = str.concat("我是程序员!");
//		System.out.println(concat);
//		System.out.println("-----输出2------------");
//		concat = concat+"我是优秀的程序员!";
//		String replace = concat.replace("优秀", "牛牛");
//		System.out.println(replace);
//		System.out.println("-----输出3------------");
//		String substring = replace.substring(4);
//		System.out.println(substring);
		StringBuilder str = new StringBuilder("大家好！");
		str.append("我是程序员!");
		System.out.println(str);
		StringBuilder str1 = str.insert(6, "优秀");
		System.out.println(str1);

		StringBuilder str3 = str1.replace(6, 8, "牛牛");
		System.out.println(str3);

		StringBuilder str2 = str3.delete(0, 4);
		System.out.println(str2);


	}

	private static void test01(String str) {


	}
}
