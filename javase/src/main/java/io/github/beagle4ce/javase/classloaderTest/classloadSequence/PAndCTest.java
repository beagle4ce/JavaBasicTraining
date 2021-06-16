package io.github.beagle4ce.javase.classloaderTest.classloadSequence;

/**
 * @author: Beagle
 * @since: 六月/16/2021 星期三
 */
public class PAndCTest {
    
    public static void main(String[] args) {
        // 这里由于根本没用到Child的任何属性或方法，所以Child属于被动调用，实质上是使用的Parent的属性。
        // 所以按照JVM虚拟机遇到Child优先初始化Parent的机制来讲，Parent会被优先初始化，而Child由于没有被实际使用而不被初始化
        System.out.println(Child.fieldParentStr);
    
        System.out.println("=====华丽丽的分割线=====");
    
        // 这里若是调用的子类就不同了。父类和子类都会被初始化
        System.out.println(Child.fieldChildStr);
    }
}
