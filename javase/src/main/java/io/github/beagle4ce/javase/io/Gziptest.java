package io.github.beagle4ce.javase.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.GZIPInputStream;

/**
 * Gziptest
 *
 * @author LLH
 * @since 六月/09/2021 星期三
 */

public class Gziptest {
    
    private final static String[] CONDITIONS = {"001","005","009","010"};
    
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new GZIPInputStream(
                                new FileInputStream(
                                        "D:\\DESKTOP\\1广告系统\\宁夏广告系统\\临时智家数据同步服务\\" +
                                                "LDAPM_GU_BDM_LABEL_TMEP.20210425.202104.03.001.001.864.DAT.gz")), StandardCharsets.UTF_8));
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(
                             new FileOutputStream("C:\\Users\\Beagle\\Downloads\\userInf"
                                     + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmm")) + ".txt"), StandardCharsets.UTF_8))) {
            int countor = 0;
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                String matchedLine = findMatchedUserInf(line);
                if (matchedLine == "") {
                    continue;
                }
                bw.write(matchedLine);
                bw.newLine();
                ++countor;
                if (countor % 10000 == 0) {
                    System.out.println(countor);
                    bw.flush();
                }
                
            }
            System.out.println(countor);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 根据过滤条件筛选符合的用户
     * 当前筛选条件：R1类型下的1，5，9，10标签
     * @param line
     * @return
     */
    private static String findMatchedUserInf(String line) {
        String[] items = line.split("\u0005");
        if (items[5] == "-1") {
            return "";
        }
        String[] subItems = items[5].split("\\|");
        for (String subItem : subItems) {
            for (String condition : CONDITIONS) {
                if (subItem.equals(condition)) {
                    return String.join("|", items[4],condition);
                }
            }
        }
        return "";
    }
}
