package myIO.nio;

import java.nio.Buffer;
import java.nio.CharBuffer;

public class BufferStudy {
    /**
     * 显示buffer内各指针位置
     * @param buffer
     */
    public static void showNowBufferStatus(String actionName,Buffer buffer){
        System.out.println("\n\n"+actionName);
        System.out.println("Capacity指针位置:"+buffer.capacity());
        System.out.println("Limit指针位置:"+buffer.limit());
        System.out.println("position指针位置:"+buffer.position());
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(16);
        BufferStudy.showNowBufferStatus("初始化buffer",charBuffer);
        charBuffer.put('a');
        charBuffer.put('b');
        charBuffer.put('c');
        charBuffer.put('d');
        charBuffer.put('e');
        charBuffer.put('f');
        charBuffer.put('g');
        BufferStudy.showNowBufferStatus("压入数据后",charBuffer);
        
        charBuffer.flip();
        BufferStudy.showNowBufferStatus("执行了flip()方法后",charBuffer);
        
        charBuffer.compact();
        BufferStudy.showNowBufferStatus("执行了compact()方法后",charBuffer);
        
        System.out.println("\n未执行flip方法前,尝试用get()方法获取Buffer的值:"
                        +charBuffer.get()
                        +charBuffer.get()
                        +"\n很显然,完全获取不到,但limit指针却后移了\n\n");
        
        charBuffer.flip();
        BufferStudy.showNowBufferStatus("执行了flip()方法后",charBuffer);
        System.out.println("\n\n执行flip方法后,尝试用get()方法获取Buffer的值:"+charBuffer.get());
        System.out.println("执行flip方法后,尝试用get()方法获取Buffer的值:"+charBuffer.get());
        System.out.println("执行flip方法后,尝试用get()方法获取Buffer的值:"+charBuffer.get());
        BufferStudy.showNowBufferStatus("执行了get()方法后",charBuffer);
        
        System.out.println("\n利用循环遍历出剩下的元素并打印出来:\n");
        for(int i = 1;charBuffer.hasRemaining();i++){
            System.out.print(charBuffer.get()+"[i="+i+"],");
        }
        System.out.println("\n我们发现由于前面在未执行flip()方法时\n"
                + "已经执行了2次get()方法,所以limit指针往后移动了,\n"
                + "也就是说,这样的方法还是有可能会遍历出空值的.");
        BufferStudy.showNowBufferStatus("完全遍历到limit指针后",charBuffer);
        
        charBuffer.clear();
        BufferStudy.showNowBufferStatus("执行clear()方法后",charBuffer);
    }

}
