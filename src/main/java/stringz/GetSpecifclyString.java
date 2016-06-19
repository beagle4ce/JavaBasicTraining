package stringz;

public class GetSpecifclyString {

    public static void main(String[] args) {
        String str = "Own String Values";
        String[] strs = str.split(" ", 2);
        System.out.println(strs.length);
        for(int i=1;i<strs.length;i++){
           System.out.print(strs[i]+",");
        }
        
        System.out.println("\n======获取指定的字符串是否有匹配数据======");
        String specificlyString = "String";
        int beginIndex = str.indexOf(specificlyString);
        System.out.println("起始位置:"+beginIndex);
        int endIndex = beginIndex+specificlyString.length();
        System.out.println("终止位置:"+endIndex);
        String resultString = str.substring(beginIndex, endIndex);
        System.out.println("匹配字符串是:"+specificlyString+"\n匹配结果:"+resultString);
    }

}
