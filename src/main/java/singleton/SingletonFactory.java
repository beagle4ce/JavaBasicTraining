package singleton;

public class SingletonFactory {
    private static volatile Object myObj = null;

    private SingletonFactory() { }
    
    public static Object getInstance(Class<?> myclass) throws Exception{
        if( myObj == null){
            synchronized (myObj.getClass()) {
                if( myObj == null){
                    myObj = myclass.newInstance();
                }
            }
        }
        return myObj;
    }
}
