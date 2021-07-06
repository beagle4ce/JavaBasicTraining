package io.github.beagle4ce.javase.thread_test;

import io.github.beagle4ce.javase.thread_test.demo.SynchronizeTest;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ObjectLock
 *
 * @author LLH
 * @since 五月/06/2021 星期四
 */

public class ObjectLock {
    
    // Run it and look what happend
    public static void main(String[] args) {
    
        SynchronizeTest s1 = new SynchronizeTest();
        
    
        new Thread(() -> {
            s1.setName("AAA");
            s1.setSleepTime(20*1000);
            s1.showObjLock();
        }).start(); // 这里会被锁死20秒
        
    
        new Thread(() -> {
            s1.setName("BBB");
            s1.setSleepTime(1000);
            s1.showObjLock();
        }).start();
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    }
}
