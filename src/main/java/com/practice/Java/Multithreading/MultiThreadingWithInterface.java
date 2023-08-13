package com.practice.Java.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingWithInterface {

    public static void main(String[] args) {

//        Runnable runnable1 = new a();
//        Runnable runnable2 = new b();
//        Thread t1 = new Thread(runnable1);
//        Thread t2 = new Thread(runnable2);
//        t1.start();
//        t2.start();

        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(new apple());
        service.shutdown();
    }
}

class apple implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("Hello no. "+ i);
        }
    }
}
class b implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("Hii. "+ i);
        }
    }
}