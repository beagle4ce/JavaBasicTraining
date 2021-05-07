package io.github.beagle4ce.javase.hutool_test;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ZipUtil;

import java.nio.charset.StandardCharsets;

/**
 * HutoolZipUtilTest
 *
 * @author LLH
 * @since 五月/06/2021 星期四
 */

public class HutoolZipUtilTest {
    
    public static void main(String[] args) {
        ZipUtil.zip(FileUtil.file("D:\\AMTProject\\JavaBasicTraining\\javaSE\\resource\\bbb\\aa.tar"),
                StandardCharsets.UTF_8, false,
                FileUtil.file("D:\\AMTProject\\JavaBasicTraining\\javaSE\\resource\\aaa"));
        
    }
}
