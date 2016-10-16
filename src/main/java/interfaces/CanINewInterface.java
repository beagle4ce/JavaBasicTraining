package interfaces;

public class CanINewInterface {

    public static void main(String[] args) {
        
        // 这其实是个接口,所以在使用前我们把它实例化同样的在观察者模式的支持下,可以激活Event内容
        ExtendInterface extendInterface = new ExtendInterface(){
            void showTime(){
                System.out.println("hahahaha");
            }
        };
    }

}
