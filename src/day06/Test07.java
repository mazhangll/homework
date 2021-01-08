package day06;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String input = scan.nextLine().trim();
		File file = new File(input);
		if(!file.exists()){
			System.out.println("文件不存在");
			return;
		}
		//单字节复制
		Test07 c1 = new Test07();
		c1.copy1(input);
		//字节数组形式复制
		Test07 c2 = new Test07();
		c2.copy2(input);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
//	public void copy1(String name){
//
//	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
//	public void copy2(String name){
//
//	}
	Scanner scan = new Scanner(System.in);
	System.out.println("请输入文件名:");
	String input = scan.nextLine().trim();
	File file = new File(input);
		if(!file.exists()){
		System.out.println("文件不存在");
		return;
	}



	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 * @throws IOException
	 */
	public void copy1(String name) throws IOException{
		RandomAccessFile raf = new RandomAccessFile(name,"r");
		int num = name.indexOf(".");
		String str = name.substring(0, num)+"_copy."+name.substring(num+1);
		//利用split(方法也可以得到)
		//String names[] = name.split("\\.");
		//RandomAccessFile desc = new RandomAccessFile(names[0]+"_copy."+names[1],"rw");

		RandomAccessFile des = new RandomAccessFile(str,"rw");
		int d = -1;
		while( (d = raf.read()) != -1 ){
			des.write(d);
		}
		System.out.println("复制完毕");
		raf.close();
		des.close();
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 * @throws IOException
	 */
	public void copy2(String name) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(name,"r");
		int num = name.indexOf(".");
		String str = name.substring(0, num)+"_copy."+name.substring(num+1);
		RandomAccessFile des = new RandomAccessFile(str,"rw");

		byte[] sub = new byte[1024*10];//10KB
		int len = -1;
		while((len = raf.read(sub)) != -1){
			des.write(sub, 0, len);
		}
		System.out.println("复制完毕");
		raf.close();
		des.close();
	}

}
