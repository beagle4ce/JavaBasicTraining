package io.github.beagle4ce.javase.thread_test.waitAndWakeup;

/**
 * WaitAndNotify
 *
 * @author LLH
 * @since 六月/23/2021 星期三
 */

public class WaitAndNotify {
    
    public synchronized void waitMethod() {
        System.out.println("waitMethod running");
        try {
            this.wait(); // 进入等待状态
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("waitMethod be notified");
    }
    
    public synchronized void notifyMethod() { // 如果要使用wait()或者notify(),必须要加锁,这样才能让对象获得monitor,wait()和notify()才能被使用.
        System.out.println("notifyMethod running");
        this.notify(); // 释放对象的等待状态
        System.out.println("notifyMethod to notified");
    }
    
    public static void main(String[] args) {
        WaitAndNotify w = new WaitAndNotify();
        new Thread(w::waitMethod).start();
        try {
            Thread.sleep(30*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(w::notifyMethod).start();
    }
}
