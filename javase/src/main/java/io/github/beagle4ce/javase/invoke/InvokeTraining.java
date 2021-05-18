package io.github.beagle4ce.javase.invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: Beagle
 * @since: 五月/17/2021 星期一
 */
public class InvokeTraining {
    
    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchFieldException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {
    
        Class<?> personClass = Class.forName("io.github.beagle4ce.javase.invoke.Person"); // 获取全路径下的类加载器
        Constructor<?> personClassDeclaredConstructor = personClass.getDeclaredConstructor(); // 使用代理调用这个类自己的构造器
        Person person = (Person) personClassDeclaredConstructor.newInstance(); // 将构造器执行，实例化对象
        
        Field privateStaticObjField = personClass.getDeclaredField("privateStaticObj");
//        String s = new String();
//        privateStaticObjField.get(s); // 私有静态对象无法反射出来
    
        Method getPrivateStaticObjMethod = personClass.getDeclaredMethod("getPrivateStaticObj"); // 获取类的私有静态方法
        getPrivateStaticObjMethod.setAccessible(true); // 若遇到私有修饰的时候将这个方法设置为可访问的
        Object invoke = getPrivateStaticObjMethod.invoke(person); // 使用反射器调用这个对象拿到这个私有静态方法的执行结果
        System.out.println("\n" + invoke.toString() + "\n"); // 私有静态方法可以被反射出来
//        System.out.println("\n" + s+ "\n");
    }
}
