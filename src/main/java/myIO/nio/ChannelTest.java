package myIO.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ChannelTest {

    public static void main(String[] args) {
        String windowsDesktopPath = "C:/Users/Keercat/Desktop/";
        String filePath = windowsDesktopPath+"01test.txt";
        Charset charset = Charset.forName("gbk");
        CharsetDecoder charsetDecoder = charset.newDecoder();
        
        try (FileInputStream fis = new FileInputStream(filePath)){
            if(fis != null){
                FileChannel fc = fis.getChannel();
                ByteBuffer byteBuff = ByteBuffer.allocate(16);
                CharBuffer charBuffer = CharBuffer.allocate(16);
                int bytesRead = fc.read(byteBuff);
                 
                while(bytesRead > -1){
                    System.out.println("\nbytes read is:"+bytesRead);
                    byteBuff.flip();
                    charBuffer = charsetDecoder.decode(byteBuff);
                    while (charBuffer.hasRemaining()) {
                        System.out.print(charBuffer.get());
                        Thread.sleep(10);
                    }
                    byteBuff.compact();
                    bytesRead = fc.read(byteBuff);
                }
            }
        } catch (FileNotFoundException ef) {
            ef.printStackTrace();
        } catch (IOException eio) {
            eio.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}
