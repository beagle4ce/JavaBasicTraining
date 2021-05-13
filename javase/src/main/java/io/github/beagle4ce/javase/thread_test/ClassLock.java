package io.github.beagle4ce.javase.thread_test;

import io.github.beagle4ce.javase.thread_test.demo.SynchronizeStaticTest;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ClassLock
 *
 * @author LLH
 * @since 五月/06/2021 星期四
 */

public class ClassLock {
    
    // Run it and look what happend
    public static void main(String[] args) {
    
        Map<String, Integer> map = new LinkedHashMap<>();
        
        map.put("AAA", 10*1000);
        map.put("BBB", 1000);
    
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue());
            new Thread(() -> {
                SynchronizeStaticTest.show(entry.getKey(), entry.getValue());
            }).start();
        }
        
    }
}
