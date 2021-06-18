package io.github.beagle4ce.javase.nowcoder;

/**
 * @author: Beagle
 * @since: 六月/15/2021 星期二
 */
public class SuperDerived {
    
    // 只要是被子类重写的方法，不被super调用都是调用子类方法
    public static void main(String[] args) {
        Base b = new Derived();
        b.methodOne();
    }
}

class Base
{
    public void methodOne()
    {
        // 1
        System.out.print("A");
        // 2
        methodTwo();
        // 只要是被子类重写的方法，不被super调用都是调用子类方法,这个时候的Base其实是在子类里面的，所以调用Base的methodTwo()的时候
        // 其实是在调用子类重写的methodTwo()
    }
    
    public void methodTwo()
    {
        // 2
        System.out.print("B");
    }
}

class Derived extends Base
{
    public void methodOne()
    {
        // 1
        super.methodOne();
        // 4
        System.out.print("C");
    }
    
    public void methodTwo()
    {
        // 2
        super.methodTwo();
        // 3
        System.out.print("D");
    }
}
