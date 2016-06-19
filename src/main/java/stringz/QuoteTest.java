package stringz;

public class QuoteTest {

    public static void main(String[] args) {
        String str = "test";// 这句相当于把"test"这个匿名引用地址传递给了str这个有名字的引用
        String strB = new String("test");
        
        if(str == "test"){
            System.out.println("这两个都是引用,只不过一个是匿名引用而已");
        }
        
        if(strB == "test"){
            System.out.println("这句话永远不会被执行");
            // 因为已经是不同的引用了
        }
    }

}
