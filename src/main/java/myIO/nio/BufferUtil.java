package myIO.nio;

import java.nio.Buffer;

public class BufferUtil {
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
    
    public static void showNowBufferStatus(String actionName,Buffer[] buffers){
        int countor = 0;
        System.out.println("\n\n"+actionName);
        for(Buffer buff:buffers){
            System.out.println("Buffer["+countor+"] Capacity指针位置:"+buff.capacity());
            System.out.println("Buffer["+countor+"] Limit指针位置:"+buff.limit());
            System.out.println("Buffer["+countor+"] position指针位置:"+buff.position());
            System.out.println("==========================================");
            countor++;
        }
        
    }
}
