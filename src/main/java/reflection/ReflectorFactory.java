package reflection;

public class ReflectorFactory<T> {
    private volatile static ReflectorFactory rfFactory;
    private volatile Class<T> myClass;
    private T r;
    
    private ReflectorFactory(){}
    
    public static ReflectorFactory<T> getObject()
    {
        if( null == rfFactory )
        {
            synchronized (ReflectorFactory.class) {
                if( null == rfFactory )
                {
                    rfFactory = new ReflectorFactory<>();
                }
            }
        }
    }
    
    public T getInstance(Class<T> x) 
            throws Exception {
        myClass = x;
        if( null == myClass )
        {
            synchronized (myClass) {
                if( null == myClass )
                {
                    r = myClass.getConstructor().newInstance();
                }
            }
        }
        return r;
    }
    
    public Object runMethod(String methodName,)
    {
        myClass.getMethod(methodName).invoke(r);
        return null;
    }
}
