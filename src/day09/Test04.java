package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    Thread.sleep(1000);
                    long l = System.currentTimeMillis();
                    Date date = new Date(l);
                    SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String format = DateFormat.format(date);
                    System.out.println(format);
                }
            }

        };
        thread.start();
    }
}
