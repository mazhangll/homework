package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner sc=new Scanner(System.in);
        String next = sc.next();
        File file=new File(next);
        boolean exists = file.exists();
        int i=1;
        if (exists){
            System.out.println("该目录已经存在,并已创建该目录副本");
            while (exists){

                File file1=new File(next+"_副本"+i);
                if (file1.mkdirs()){
                    exists=false;
                }else {
                    i++;
                }

            }
        }else {
            file.mkdirs();
        }

    }
 }


