package io.github.beagle4ce.javase.classloaderTest;

import java.lang.reflect.InvocationTargetException;

/**
 * @author: Beagle
 * @since: 五月/17/2021 星期一
 */
public class ClassForNameTest {
    
    public static void main(String[] args) {
        WillBeLoaded willBeLoaded = null;
        try {
            Class<?> aClass = Class.forName("io.github.beagle4ce.javase.classloaderTest.WillBeLoaded");
            willBeLoaded = (WillBeLoaded)aClass.getDeclaredConstructor().newInstance();
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
        
        willBeLoaded.setName("That classlaod from Class.forName(...)");
        System.out.println("\n" + willBeLoaded.getName() + "\n");
    }
}
