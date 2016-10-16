package referenceTransfer;

public class ReferenceTransferTest {
    
    public static ClazzA changeOrNotChange(ClazzA input){
        input = new ClazzA();// 如果将引用重新对接到新的对象上,则不会发生引用传递,本来也就断开了.
        //input.text = "haha";
        return input;
    }

    public static void main(String[] args) {
        ClazzA clazzA = new ClazzA();
        clazzA.text = "heihei";
        System.out.println(ReferenceTransferTest.changeOrNotChange(clazzA).text);
    }

}

class ClazzA{
    public String text;
}
