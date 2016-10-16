package sockets;

import java.util.concurrent.FutureTask;

public class RunApp {

    public static void main(String[] args) {
        
        new Thread(new FutureTask<String>(new ClientSocket())).start(); 
    }

}
