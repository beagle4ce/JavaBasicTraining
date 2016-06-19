package myIO.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ScatterAndGather {

    public static void main(String[] args) {
        final int BufferAllocate = 16;
        String windowsDesktopPath = "C:/Users/Keercat/Desktop/";
        String filePath = windowsDesktopPath+"01test.txt";
        String wirteFilePath = windowsDesktopPath+"02test.txt";
        
        CharBuffer charBuffer = CharBuffer.allocate(BufferAllocate);
        ByteBuffer byteBufferA = ByteBuffer.allocate(BufferAllocate);
        ByteBuffer byteBufferB = ByteBuffer.allocate(BufferAllocate);
        ByteBuffer[] byteBuffers = {byteBufferA,byteBufferB};
        Charset gbk = Charset.forName("gbk");
        CharsetDecoder charsetDecoder = gbk.newDecoder();
        
        try(RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
                RandomAccessFile rafW = new RandomAccessFile(wirteFilePath, "rw")){
            FileChannel fileChannel = raf.getChannel();
            FileChannel wirteFileChannel = rafW.getChannel();
            long readCount = fileChannel.read(byteBuffers);
            wirteFileChannel.position(rafW.length());
            wirteFileChannel.write(byteBuffers);
            while(readCount > -1){
                byteBuffers[0].flip();
                byteBuffers[1].flip();
                BufferUtil.showNowBufferStatus("查看byteBuffers的状态", byteBuffers);
                wirteFileChannel.position(rafW.length());
                wirteFileChannel.write(byteBuffers);// 同样的Channel的write方法会改变Buffer的状态
                // 所以如果要保证显示并拷贝进新的文件里,则可以使buffer的position归零来实现
                byteBuffers[0].position(0);
                byteBuffers[1].position(0);
                BufferUtil.showNowBufferStatus("查看byteBuffers的状态", byteBuffers);
                while(byteBuffers[0].hasRemaining() || byteBuffers[1].hasRemaining()){
                    charBuffer = charsetDecoder.decode(byteBuffers[0]);
                    System.out.print(charBuffer);
                    charBuffer = charsetDecoder.decode(byteBuffers[1]);
                    System.out.print(charBuffer);
                }
                byteBuffers[0].compact();
                byteBuffers[1].compact();
                readCount = fileChannel.read(byteBuffers);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
