package io.github.beagle4ce.javase.invoke.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Beagle
 * @since: 五月/18/2021 星期二
 */
public interface Human {
    
    void setName(String name);
    
    void setAge(int age);
    
    void setGender(boolean gender);
    
    String getName();
    
    int getAge();
    
    boolean isGender();
}
