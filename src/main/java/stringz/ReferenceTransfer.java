package stringz;

public class ReferenceTransfer {
    public static void test(String str){
        str = "abcd";
        str += "efg";
    }

    public static void main(String[] args) {
        String str = "hello";
        ReferenceTransfer.test(str);
        System.out.println(str);
        // 输出结果为"hello" 很显然引用没有被传递进方法内部
    }
}
