package io.github.beagle4ce.javase.invoke.proxy;

/**
 * @author: Beagle
 * @since: 五月/18/2021 星期二
 */
public class Man implements Human{
    
    private String name;
    
    private int age;
    
    private boolean gender;
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void setAge(int age) {
        System.out.println("this is set age method");
        this.age = age;
    }
    
    @Override
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public int getAge() {
        System.out.println("this is get age method");
        return this.age;
    }
    
    @Override
    public boolean isGender() {
        return this.gender;
    }
}
