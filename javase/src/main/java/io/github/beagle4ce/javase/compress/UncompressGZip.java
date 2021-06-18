package io.github.beagle4ce.javase.compress;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;

/**
 * UncompressGZip
 *
 * @author LLH
 * @since 六月/08/2021 星期二
 */

public class UncompressGZip {
    
    public static void main(String[] args) throws IOException {
        File path = new File(System.getProperty("user.dir") + File.separator + "tmp" + File.separator);
        path.mkdirs();
        GZIPInputStream gzis = new GZIPInputStream(
                new FileInputStream("D:\\DESKTOP\\1广告系统\\宁夏广告系统\\临时智家数据同步服务\\LDAPM_GU_BDM_LABEL_TMEP.20210425.202104.03.001.002.864.DAT.gz"));
        Files.copy(gzis, Paths.get(path.getPath() + File.separator + "abc.dat"));
    }
}
