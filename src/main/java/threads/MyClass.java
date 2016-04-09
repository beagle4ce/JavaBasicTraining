package threads;

import java.util.Scanner;

public class MyClass implements Runnable {
    
    @Override
    public void run() {
        int icount = 0;
        while(icount < 1){
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            icount = method(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getLocalizedMessage());
            }
        }
    }
    
    /*@Override
    public void run() {
        int icount = 0;
        while(icount < 1){
            System.out.println("test");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getLocalizedMessage());
            }
        }
    }*/
    
    public int method(String values){
        int resultNum = 0;
        String mySwich = "close";
        if(!values.equals(mySwich)){
            System.out.println("value is :"+values);
        }else{
            resultNum = 1;
        }
        return resultNum;
    }
}