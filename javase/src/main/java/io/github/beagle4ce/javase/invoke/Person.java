package io.github.beagle4ce.javase.invoke;

/**
 * @author: Beagle
 * @since: 五月/17/2021 星期一
 */
public class Person {
    
    public static String publicStaticObj = "this is public static object!";
    private static String privateStaticObj = "this is private static object!";
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    private static String getPrivateStaticObj() {
        return privateStaticObj;
    }
    
    public static void setPrivateStaticObj(String privateStaticObj) {
        Person.privateStaticObj = privateStaticObj;
    }
}
