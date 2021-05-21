package io.github.beagle4ce.javase.lockTraining;

/**
 * @author: Beagle
 * @since: 五月/19/2021 星期三
 */
public class RoadTest {
    
    public static void main(String[] args) {
//        case1();
        case2();
//        case3();
    }
    
    public static void case1() {
        // 这里就是对象锁，只要上一个对象不释放，下一个对象根本没机会拿到锁
        Car car = new Car();
        car.setName("BMW3-325i");
    
        new Thread(() -> {
            try {
                car.drive("Tomas");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    
        // You'll see, Elle have no chance to drive the car
        new Thread(() -> {
            try {
                car.drive("Elle");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
    public static void case2() {
        // 这里就是对象锁，只要上一个对象不释放，下一个对象根本没机会拿到锁
        Car car = new Car();
        car.setName("BMW3-325i");
        
        new Thread(() -> {
            try {
                car.drive("Tomas");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    
        // 这里我们能看到我们重新建立了一台车，给了Elle，这样ta就可以开车了
        Car car2 = new Car();
        car2.setName("Benz-C260");
        
        new Thread(() -> {
            try {
                car2.drive("Elle");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
    public static void case3() {
        /*
        这里将展示类锁的威力，即便有多个对象，只要类锁存在，那么这多个对象就一定只能执行其中一个。因为整个类被加锁。
        这里若是用反射的方式来运行就可以跑多个车了，毕竟反射相当于新建了一条高速
        懒汉双重锁单例模式就是应用到了类锁来保证所有线程下全局唯一，虽然防不了反射～～～～
         */
        Car car = new Car();
        car.setName("BMW3-325i");
        car.setMaxSpeed(120);
        new Thread(() -> {
            try {
                Car.highway(car);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    
        /*
        在类锁的加持下，只要BMW3-325i上了高速，下面这个Benz就毫无机会了
         */
        Car car2 = new Car();
        car2.setName("Benz-C260");
        car2.setMaxSpeed(119);
        new Thread(() -> {
            try {
                Car.highway(car2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
