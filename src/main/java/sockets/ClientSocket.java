package sockets;

import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Callable;

public class ClientSocket implements Callable<String>{

    @Override
    public String call() throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostAddress());
        System.out.println(InetAddress.getLocalHost());
        System.out.println(address.getCanonicalHostName());
        System.out.println(address.getHostName());
        int port = 4400;
        int timeout = 10000;
        
        Socket socket = new Socket(address, port);
        socket.setSoTimeout(timeout);
        SocketChannel socketChannel = socket.getChannel();
        ByteBuffer dst = ByteBuffer.allocate(1024);
        socketChannel.read(dst);
        
        return null;
    }
    
}
