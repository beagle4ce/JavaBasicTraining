package io.github.beagle4ce.javase.oom;

/**
 * Person
 *
 * @author LLH
 * @since 五月/27/2021 星期四
 */

public class Person {
    
    private String name;
    
    private static void privateStaticMethod() {
    
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Person() {
    }
    
    public Person(String name) {
        this.name = name;
    }
}
