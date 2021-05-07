package io.github.beagle4ce.javase.thread_test.demo;

/**
 * SynchronizeTest
 *
 * @author LLH
 * @since 五月/07/2021 星期五
 */

public class SynchronizeTest {
    
    private String name;
    
    private int sleepTime;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSleepTime() {
        return sleepTime;
    }
    
    synchronized public void showObjLock() {
        while (true) {
            System.out.println(this.name);
            try {
                Thread.sleep(this.sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
