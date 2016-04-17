package myForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ForkJoinPoolTest {
    
    public static void main(String[] args) {
        // 创建包含Runtime.getRuntime().availableProcessors()-
        // -返回值作为个数的并行线程的ForkJoinPool
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        // 提交可分解的PrintTask任务
        forkJoinPool.submit(new PrintTask(0, 200));
        try {
            forkJoinPool.awaitTermination(2, TimeUnit.SECONDS); // 阻塞当前线程直到-
                                                                // -ForkJoinPool-
                                                                // -中所有的任务都执行结束
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }finally {
            // 关闭线程池
            forkJoinPool.shutdown();
        }               
    }
}
