package io.github.beagle4ce.javase.hutool_test;

import cn.hutool.core.util.IdUtil;

/**
 * UUIDGenerator
 *
 * @author LLH
 * @since 五月/21/2021 星期五
 */

public class UUIDGenerator {
    
    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i++) System.out.println(IdUtil.fastSimpleUUID());
    }
}
