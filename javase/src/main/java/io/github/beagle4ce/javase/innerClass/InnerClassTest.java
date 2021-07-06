package io.github.beagle4ce.javase.innerClass;

/**
 * InnerClassTest
 *
 * @author LLH
 * @since 六月/24/2021 星期四
 */

public class InnerClassTest {
    
    public static void main(String[] args) {
    
    }
    
    public void method() {
    
        class PublicMethodInnerClass {
        }
        
    }
    
    
    private class PrivateInnerClass {
        public String publicStr = "PrivateInnerClass-publicStr";
    }
    
    protected class ProtecatedInnerClass {
        public String publicStr = "PrivateInnerClass-publicStr";
    }
    
    public class PublicInnerClass {
        public String publicStr = "PrivateInnerClass-publicStr";
    }
    
    public static class PublicStaticClass {
        public String publicStr = "PrivateInnerClass-publicStr";
    }
    
}
