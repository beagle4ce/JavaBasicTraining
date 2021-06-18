package io.github.beagle4ce.javase.annotation;

/**
 * @author: Beagle
 * @since: 五月/22/2021 星期六
 */
public class InvokeAnnotation {
    
    // 使用这个自定义方法注解，且number属性赋值为3
    @CustomMethodAnnotation(number = 3)
    public void test1() {
        // 一个空白方法
    }
    
    public static void main(String[] args) throws NoSuchMethodException {
        InvokeAnnotation ia = new InvokeAnnotation(); // 首先实例化这个测试用的类
        
        // 利用类反射出方法，再用方法里面反射出的注解，调用注解内的方法获得值
        // 同时这里可以继续反射注解类，并重设注解类内部属性的值后执行invoke反射实例化
        int result = ia.getClass().getDeclaredMethod("test1")
                .getDeclaredAnnotation(CustomMethodAnnotation.class).number();
        // 所以spring在执行的时候会规定扫描包的路径，否则做全文件扫描太慢了，只能逐一查看类和方法上的注解。
    
        // 这里会报错，类上面没有这个注解，是拿不到数据的，会报NPE
        // int result2 = ia.getClass().getDeclaredAnnotation(CustomMethodAnnotation.class).number();
        
        System.out.println(result);
        // System.out.println(result2);
    }
}
