package io.github.beagle4ce.javase.transfer_test;

/**
 * IntegerTest
 *
 * @author LLH
 * @since 五月/06/2021 星期四
 */

public class IntegerTest {
    
    public static void add1(Integer i) {
        Integer val = i.intValue();
        val += 1;
        i = new Integer(val);
        // 0
    }
    
    public static void add2(Integer i) {
        i += 2;
        // 0
    }
    
    public static void main(String[] args) {
        Integer i = new Integer(0);
        add2(i);
        System.out.println(i.intValue());
    }
}
