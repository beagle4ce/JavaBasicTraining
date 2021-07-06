package io.github.beagle4ce.javase;

import cn.hutool.extra.ftp.Ftp;
import cn.hutool.extra.ftp.FtpConfig;
import cn.hutool.extra.ftp.FtpMode;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * FastTest
 *
 * @author LLH
 * @since 五月/06/2021 星期四
 */

public class FastTest {
    
    
    public static void main(String[] args) {
        FtpConfig ftpConfig = new FtpConfig();
        ftpConfig.setHost("192.168.2.208");
        ftpConfig.setPort(21);
        ftpConfig.setUser("amtuser");
        ftpConfig.setPassword("Amt_2018");
        ftpConfig.setCharset(StandardCharsets.UTF_8);
        ftpConfig.setConnectionTimeout(10*1000);
        
        Ftp ftp = new Ftp(ftpConfig, FtpMode.Active);
        List<String> fileNames = ftp.ls("./ADVTest");
        fileNames.forEach(System.out::println);
    }
    
}
