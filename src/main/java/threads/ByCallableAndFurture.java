package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ByCallableAndFurture {
    private static int countor = 0;
    public static void main(String[] args) {
        
        Callable<String> myCallablea = new Callable<String>() {

            @Override
            public String call() throws Exception {
                //int countor = 0;
                String threadName = "";
                String str = "";
                str.isEmpty();
                while (countor < 20) {
                    Thread.sleep(500);
                    threadName = Thread.currentThread().getName() + " " + countor;
                    System.out.println(threadName);
                    countor++;
                }
                return threadName;
            }
        };
        
        Callable<String> myCallableb = new Callable<String>() {

            @Override
            public String call() throws Exception {
                //int countor = 0;
                String threadName = "";
                while (countor < 20) {
                    Thread.sleep(500);
                    threadName = Thread.currentThread().getName() + " " + countor;
                    System.out.println(threadName);
                    countor++;
                }
                return threadName;
            }
        };

        FutureTask<String> fta = new FutureTask<>(myCallablea);
        FutureTask<String> ftb = new FutureTask<>(myCallableb);

        for (int j = 0; j < 40; j++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " " + j);
                if (j == 0) {
                    new Thread(fta, "ThreadA").start();
                    new Thread(ftb, "ThreadB").start();
                }
                System.out.println("test:"+fta.get() + " & " + ftb.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

}
