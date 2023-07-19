package org.example.Java.Multithreading;

public class MultiThreading {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        obj.start();
        obj1.start();
    }
}
class A extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("Hello no. "+ i);
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("Hii no. "+ i);
        }
    }
}