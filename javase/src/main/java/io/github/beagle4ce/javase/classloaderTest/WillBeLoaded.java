package io.github.beagle4ce.javase.classloaderTest;

/**
 * @author: Beagle
 * @since: 五月/17/2021 星期一
 */
public class WillBeLoaded {
    
    private static String staticObject = "I'm Static object";
    
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public static String getStaticObject() {
        return staticObject;
    }
    
    public static void setStaticObject(String staticObject) {
        WillBeLoaded.staticObject = staticObject;
    }
}
