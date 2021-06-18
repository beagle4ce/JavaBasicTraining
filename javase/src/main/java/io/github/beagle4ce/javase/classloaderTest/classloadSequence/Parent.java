package io.github.beagle4ce.javase.classloaderTest.classloadSequence;

/**
 * @author: Beagle
 * @since: 六月/16/2021 星期三
 */
public class Parent {
    
    public static String fieldParentStr = "ABC";
    static {
        System.out.println("Parent initialized");
    }
}
