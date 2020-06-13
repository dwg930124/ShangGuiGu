package com.dwg.java;

/**
 * 創建3個窗口買票，總票數100張
 *
 * @author DWG
 * @create 2020-06-09-14:33
 */

class Window1 implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":賣票：票號為：" + ticket--);
            }else {
                break;
            }

        }
    }

}

public class WindowTest1 {
    Window1 w1 = new Window1();

    public static void main(String[] args) {
        WindowTest1 test = new WindowTest1();
        Thread t1 = new Thread(test.w1);
        Thread t2 = new Thread(test.w1);
        Thread t3 = new Thread(test.w1);

        t1.setName("window1:");
        t1.start();
        t2.setName("window2:");
        t2.start();
        t3.setName("window3:");
        t3.start();
    }
}
