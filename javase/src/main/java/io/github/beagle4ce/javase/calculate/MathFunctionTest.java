package io.github.beagle4ce.javase.calculate;

/**
 * MathFunctionTest
 *
 * @author LLH
 * @since 六月/02/2021 星期三
 */

public class MathFunctionTest {
    
    public static void main(String[] args) {
        int ceilResult = (int) Math.ceil(40.01);// 向上取整
        System.out.println(ceilResult);
        System.out.println(Math.floor(40.9)); // 向下取整
    }
}
