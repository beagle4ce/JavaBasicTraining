package io.github.beagle4ce.javase.lockTraining;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Beagle
 * @since: 五月/20/2021 星期四
 */
public class Room {

    private String roomName;
    
    private final Lock lock = new ReentrantLock(); // 使锁保持终态，使外界不可更改该对象锁的状态
    
    public void goinToRoom(String somebodyName) {
        int lockCount = 0; // 用来保存锁状态，由于是重入锁，同一个对象可以对同一个锁反复加锁，所以需要保存锁的次数
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {// 若tryLock返回的是true则加锁成功
                                                         // 若未能获取到锁则3秒后返回false
                ++lockCount; // 若加锁成功
                for ( ; ; ) { // 无限循环
                    System.out.println(somebodyName + " in the " + roomName + " room");
                    Thread.sleep(2*1000); // 为了避免过快打印，强制sleep，但不释放锁和cpu资源
                }
            }
        } catch (InterruptedException e) { // 捕获异常
            e.printStackTrace(); // 打印异常栈信息
        } finally {
            if (lockCount > 0) { // 判断当加锁次数超过0的时候
                lock.unlock();   // 可进入解锁
                --lockCount;     // 解锁后需要标记减少一次加锁次数
            }
        }
    }
    
    public String getRoomName() {
        return roomName;
    }
    
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
    public static void main(String[] args) {
        Room room1 = new Room();
        room1.setRoomName("SingleHouse");
        
        new Thread(() -> {
            room1.goinToRoom("Tommy");
        }).start();
        
    
        new Thread(() -> {
            room1.goinToRoom("Amy");
        }).start();
    }
}
