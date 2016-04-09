package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    
    public static void main(String[] args) {
        int nThreads = 4;
        ExecutorService es = Executors.newFixedThreadPool(nThreads);
        MyClass mc = new MyClass();
        es.submit(mc);

        
        es.shutdown();
        //mc.method("hello");
    }

}
