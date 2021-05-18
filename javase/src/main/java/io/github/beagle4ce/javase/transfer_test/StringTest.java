package io.github.beagle4ce.javase.transfer_test;

/**
 * StringApiTest
 *
 * @author LLH
 * @since 五月/06/2021 星期四
 */

public class StringTest {
    
    public static void change(String s) {
        s = "def";
    }
    
    public static void main(String[] args) {
        String a = "abc";
        change(a);
        System.out.println(a);
    }
}
