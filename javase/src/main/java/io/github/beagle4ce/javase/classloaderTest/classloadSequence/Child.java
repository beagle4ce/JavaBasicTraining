package io.github.beagle4ce.javase.classloaderTest.classloadSequence;

/**
 * @author: Beagle
 * @since: 六月/16/2021 星期三
 */
public class Child extends Parent{
    
    public static String fieldChildStr = "DEF";
    
    static {
        System.out.println("Child initialized");
    }
}
