package com.dwg.java;

/**
 * @author DWG
 * @create 2020-06-09-14:18
 */


class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);
        thread.start();

        Thread thread1 = new Thread(myThread1);
        thread1.start();
    }
}
