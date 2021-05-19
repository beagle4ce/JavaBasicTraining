package io.github.beagle4ce.javase.invoke.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 这里就是使用JDK动态代理的代理器handler
 * @author: Beagle
 * @since: 五月/18/2021 星期二
 */
public class HumanHandler implements InvocationHandler {
    
    private Human human;
    
    public void setHuman(Human human) {
        this.human = human;
    }
    
    /**
     * 这里使用的就是JDK动态代理所需要的invoke方法，类似Spring的AOP在面对实现了该方法的类就采用JDK动态织入，否则就采用CGLIB动态织入
     * 而CGLIB动态织入采用的是继承真实对象产生代理的子类对象的方式，所以当一个类的方法标记为final终态时就无法被代理了
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // invoke(Object proxy, Method method, Object[] args) 内的proxy对象其实就是没有被代理的真实对象
        // 这里面就可以对被代理对象为所欲为
        System.out.println("\nPre invoke");
        System.out.println(method.getName());
        Object invokedHuman = method.invoke(human, args); // 反射利用真实对象创建代理对象的构造方法，并获得invoke方法的返回结果（即：代理后的对象）
        System.out.println("After invoke\n");
        return invokedHuman; // 这里需要返回对象后，才能被Proxy代理出去
    }
    
    /**
     * 实例化被代理对象
     * @return
     */
    public Human getProxy() {
        return (Human) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), // 当前线程的类加载器传入
                new Class[]{Human.class}, // 被代理的接口传入
                this /*动态处理器引入*/);
    }
}
