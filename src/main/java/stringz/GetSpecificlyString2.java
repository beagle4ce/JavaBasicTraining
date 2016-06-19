package stringz;

public class GetSpecificlyString2 {
    
    // resourceString 接收输入的源字符串
    // containString 接收输入的需要被匹配的字符串
    public static void getSpecificlyStringInfo(String resourceString,String containString){
        // 获得匹配字符串在源字符串的起始位置
        int beginIndex = resourceString.indexOf(containString);
        // 获得匹配字符串在源字符串的结束位置
        int endIndex = beginIndex + containString.length();
        
        // 获得匹配后的结果字符串
        String resuseString = resourceString.substring(beginIndex, endIndex);
        
        // 输出源字符串
        System.out.println("在字符串:\""+resourceString+"\"中");
        // 输出需要被匹配的字符串
        System.out.println("查找其中包含的字符串:\""+containString+"\"");
        // 如果需要被匹配的字符串与结果字符串内容匹配相等
        if(containString.equals(resuseString)){
            // 则输出匹配成功的消息
            System.out.println("匹配成功,字符串中包含字符串:\""+resuseString+"\"");
        }else{
            // 否则输出失败消息
            System.out.println("匹配失败,字符串中没有找到指定的匹配字符串!");
        }
        // 输出被匹配字符串冲源字符串的第几位开始
        // 需要获得起始位置+1才是被匹配字符串的第一个字母起始位置
        System.out.println("从第\""+(beginIndex+1)+"\"个字符开始");
        // 输出被匹配字符串冲源字符串的第几位结束
        System.out.println("到第\""+endIndex+"\"个字符结束");
    }

    public static void main(String[] args) {
        
        String resourceString = "Hi,this is very very simple program.";
        String containString = "very";
        GetSpecificlyString2.getSpecificlyStringInfo(resourceString, containString);
    }

}
