package reflection;

import java.lang.reflect.InvocationTargetException;

public class ReflectorFactory {
    public static <T> T getInstance(Class<T> x) 
            throws InstantiationException, IllegalAccessException, 
                    IllegalArgumentException, InvocationTargetException, 
                    NoSuchMethodException, SecurityException {
        T r = x.getConstructor().newInstance();
        return r;
    }
}
