package com.dwg.java;

/**
 * 多线程的创建
 * @author DWG
 * @create 2020-06-09-9:33
 */

class MyThread extends Thread{

    public MyThread(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i%2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        for (int i = 0; i < 1000; i++) {
//            if (i % 2 != 0) {
//                System.out.println(Thread.currentThread().getName() + ":" + i);
//            }
//        }

        //匿名子类
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if (i%2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }

        }.start();


    }
}
