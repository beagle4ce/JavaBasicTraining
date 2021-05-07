package io.github.beagle4ce.javase.thread_test.demo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * SynchronizeTest
 *
 * @author LLH
 * @since 五月/07/2021 星期五
 */

public class SynchronizeStaticTest {
    
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    synchronized static public void show(String name, int sleepTime) {
        while (true) {
            System.out.println(name);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
