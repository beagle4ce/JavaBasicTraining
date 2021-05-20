package io.github.beagle4ce.javase.lockTraining;

/**
 * @author: Beagle
 * @since: 五月/19/2021 星期三
 */
public class Car {
    
    private String name;
    
    private int maxSpeed;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    /**
     * 驾驶方法，只要有人在驾驶，其他人就不能驾驶它,直到它被人释放锁后才行
     * @param driverName
     */
    public synchronized void drive(String driverName) throws InterruptedException {
        /*
        * 锁就好像是一个房子或者车子，当没有人的时候任何人都能来获取这个锁（车子/房子）
        * 一旦有人获取了锁，就好比一个人进入了这个车子/房子，并且把门锁好。
        * 那么就再也没有第二个人能够进来了。
        * */
        while (true) {
            System.out.println("Now, " + driverName + " is driving the " + name + " car");
            Thread.sleep(5*1000);
        }
    }
    
    public static synchronized void highway(Car car) throws InterruptedException {
        /*
        这里是类锁，有了这个锁，即便新建一个该对象也无法抢占锁
         */
        while (true) {
            System.out.println("Now, " + car.name + " driving on the highway in " + car.maxSpeed + " km/h");
            Thread.sleep(5*1000);
        }
    }
}
