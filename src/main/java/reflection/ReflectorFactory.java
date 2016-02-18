package reflection;

public class ReflectorFactory {
    private ReflectorFactory(){}
    public final static <T> T getInstance(Class<T> myClass) throws Exception
    {
        T myT = myClass.newInstance();
        return myT;
    }
}
