package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Runnable myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();


        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

    }

}
