package myIO;

import java.nio.CharBuffer;

public class NewIOTest {

    public static void main(String[] args) {
        String value = "helloworld";
        CharBuffer cb = CharBuffer.allocate(15);
        System.out.println("capacity:"+cb.capacity()
            +" postion:"+cb.position()
            +" limit:"+cb.limit()
            +" remaining:"+cb.remaining());
        
        cb.put(value);
        System.out.println("\nadd item after\ncapacity:"+cb.capacity()
        +" postion:"+cb.position()
        +" limit:"+cb.limit()
        +" remaining:"+cb.remaining());
        
        cb.flip();// 封印buffer
        System.out.println("\nflip after\ncapacity:"+cb.capacity()
        +" postion:"+cb.position()
        +" limit:"+cb.limit()
        +" remaining:"+cb.remaining());
        
        cb.put("AB");
        System.out.println("\nflip after and put new item\ncapacity:"+cb.capacity()
        +" postion:"+cb.position()
        +" limit:"+cb.limit()
        +" remaining:"+cb.remaining());
        // Postion 是写指针,指到哪儿就往哪儿写入数据,
        // 而limit则是限制读取数据的时候避免后面未填写的空间读出null值.
        
        cb.append('C').append('D').append('E');// 这是一个递归方法,可以无限加载下去
        System.out.println("\nflip after and put new item\ncapacity:"+cb.capacity()
        +" postion:"+cb.position()
        +" limit:"+cb.limit() // 不过此时的limit值已经被锁定了除非使用clear()方法,才能重置limit指针
        +" remaining:"+cb.remaining());
        // cb.append('F').append('G')
        //     .append('H').append('I').append('J').append('K').append('L');
        // 这个时候如果还想加入超过limit指针的数据是无法实现滴
    }

}
