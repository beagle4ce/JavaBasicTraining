package extend;

public class RunningOfClazz {
    public static void staticMethod(){
        
    }
    
    public static void getStaticMethod(){
        staticMethod();
    }

    public static void main(String[] args) {
        ClazzC clazzC = new ClazzC();
        clazzC.cinfoStr = "Hi,it's Class C !";
        ClazzA clazzA = clazzC;
        ClazzC clazzC2 = (ClazzC)clazzA;
        clazzC2.getInfo("hi");
        System.out.println(clazzC2.cinfoStr);
        //这样会直接丢失clazzC.cinfoStr的数据
        
        String str = (String)(Object)new ClazzC();
        System.out.println(str);
        //这样会报错
//        Exception in thread "main" java.lang.ClassCastException: extend.ClazzC cannot be cast to java.lang.String
//        at extend.RunningOfClazz.main(RunningOfClazz.java:14)
//          ERROR: JDWP Unable to get JNI 1.2 environment, jvm->GetEnv() return code = -2
//          JDWP exit error AGENT_ERROR_NO_JNI_ENV(183):  [util.c:840]
    }

}
