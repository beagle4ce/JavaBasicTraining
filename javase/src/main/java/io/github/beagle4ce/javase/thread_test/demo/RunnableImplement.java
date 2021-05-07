package io.github.beagle4ce.javase.thread_test.demo;

/**
 * RunnableImplement
 *
 * @author LLH
 * @since 五月/06/2021 星期四
 */

public class RunnableImplement implements Runnable{
    
    private int sleepTime = 0;
    
    private String name;
    
    public int getSleepTime() {
        return sleepTime;
    }
    
    public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    synchronized public void show() {
        while (true) {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
    
    @Override
    public void run() {
        show();
    }
}
