package reflection;

public class ReflectMethod {

    /*
     * 这是一个标准的使用反射来运行带参数带返回值的方法
     */
    public static void main(String[] args) throws Exception {
        Class<?> re = BasicClass.class;//获取到对指定类的引用
        Object obj = re.newInstance();//用默认构造器实例化这个引用,当然了,
                                      //这个被实例化的类是有默认无参构造器的
        
        Object result = re.getMethod("sayHi", String.class).invoke(obj, "Hello,world");
        //获取到里面一个叫做sayHi的方法,并给这个方法一个String的参数类型,然后执行这个方法,
        //并给这个正被执行的方法一个参数值"hello,world"
        //执行结果被传递给Object对象
        
        String str = result.toString();//将这个结果对象转成String类型,这也是凑巧,
                                       //例子用的是String类型的参数,要是非基本类型参数则需要做强制转换,
                                       //或者把开头第9行的那个Class<?>,换成Class<你想要的对象>
                                       //比如Class<BasicClass>
        System.out.println(str);
    }

}
