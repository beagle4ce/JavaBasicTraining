package io.github.beagle4ce.javase.invoke.proxy;

/**
 * @author: Beagle
 * @since: 五月/18/2021 星期二
 */
public class ProxyTest {
    
    public static void main(String[] args) {
        Human realHuman = new Man(); // 原始对象
        HumanHandler humanHandler = new HumanHandler();
        humanHandler.setHuman(realHuman); // 传入真实对象，因为HumanHandler 里面的自定义逻辑写了一个method.invoke执行需要用到，所以传入进去
    
        Human proxyHuman = humanHandler.getProxy(); // 获取代理出来的对象
        
        proxyHuman.setAge(8);
        System.out.println(proxyHuman.getAge()); // 验证代理出来的对象是否存在且功能是否正常
    }
}
