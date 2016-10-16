package helloworld;

public class StringTest {
    public void funcA(){}
    
    public void funcA(String text){}
    
    public int funcA(int number){ return number;}

    public static void main(String[] args) {
        String str1 = new String("");
        boolean res = str1 == "";
        System.out.println(res);
    }

}
