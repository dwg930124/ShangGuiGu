package com.dwg.java;

/**
 * 創建3個窗口買票，總票數100張
 *
 * @author DWG
 * @create 2020-06-09-11:27
 */

class Window extends Thread{

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0){
                System.out.println(getName() + ":賣票：票號為：" + ticket--);
            }else {
                break;
            }

        }
    }

    public Window(String name){
        super(name);
    }
}

public class WindowTest {
    Window w1 = new Window("窗口1");
    Window w2 = new Window("窗口2");
    Window w3 = new Window("窗口3");

    public static void main(String[] args) {
        WindowTest test = new WindowTest();
        test.w1.start();
        test.w2.start();
        test.w3.start();
    }
}
