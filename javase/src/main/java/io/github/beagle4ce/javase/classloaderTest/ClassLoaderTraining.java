package io.github.beagle4ce.javase.classloaderTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: Beagle
 * @since: 五月/17/2021 星期一
 */
public class ClassLoaderTraining {
    
    public static void main(String[] args) {
        
        ClassLoaderTraining clt = new ClassLoaderTraining();
        ClassLoader classLoader = clt.getClass().getClassLoader();
        Class wbl = null;
        WillBeLoaded wblInstance = null;
        try {
            wbl = classLoader.loadClass("io.github.beagle4ce.javase.classloaderTest.WillBeLoaded");
            wblInstance = (WillBeLoaded)wbl.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Method[] methods = wbl.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        wblInstance.setName("Instance was Successfully!!!");
        System.out.println("\n" + wblInstance.getName() + "\n");
        
    }
}
