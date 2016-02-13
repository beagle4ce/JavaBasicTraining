package helloworld;

/*
 * 如你所见,JAVA的类名都是以大写开头的,同时一个.java文件对应一个带public修饰符的类
 * 如果这个时候想要在同一个.java文件下创建多个类,那么除了和.java文件同名的类使用public修饰符以外
 * 其他类是绝对不能使用该修饰符的.推荐做法就是,其他类就不写修饰符.
 */
public class HelloWorld {

    /*
     * 这个是主方法和C++类似,如果要做控制台输出,那么这个方法将会成为主入口 所以在这个项目以后的代码中会经常看到main方法.
     * 看到方法是由public修饰符,static修饰符组成: 其中public不难想象,就是说这个方法谁都可以访问
     * 而static修饰符代表这个方法是静态的,不需要使用"new"关键字来建立对象-
     * -就可以使用,比如HelloWorld.main(args)这样的用法.
     * 
     * 而void则是指的这个方法不返回任何的数据, PS:特别提醒--在java中null也是一种对象,和void还是有很大区别的.
     * null是可以被返回的,而void是神马都不返回.
     * 
     * main括号内则是参数,是方法用来接收数据的地方.此处可以看到,是接收的- -字符串数组类型的参数.
     */
    public static void main(String[] args) {
        /*
         * 这里就是方法里面的程序啦~
         * 
         * System代表的是System类, 很显然,这个类里面有一个静态对象叫做"out" 而out对象有一个方法叫做"println"
         * 方法里面则是需要传递进去的值. 这里传递进去的就是"Hello,World!"
         */
        System.out.println("Hello,World!");
    }

}

/*
 * 别想着用private来修饰最外层的类,因为JDK根本允许这样做 这样做毫无意义.
 */
// Warning message:
// Illegal modifier for the class Hi; only public, abstract & final are
// permitted
// private class Hi
// {
//
// }
