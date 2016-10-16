package threads;

public class WaitAndNotify{
    
    public static void main(String[] args) {
        Atm atm = new Atm();
        new Thread(atm).start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        atm.saveMoney(12.2);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        atm.saveMoney(18.0);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        atm.saveMoney(28.0);
//        ThreadTest tt = new ThreadTest();
//        //tt.str = "hahaA";
//        tt.str.set("hahaA");
//        
//        ThreadTest ttb = new ThreadTest();
//        //ttb.str = "heiheiB";
//        ttb.str.set("heiheiB");
//        
//        new Thread(tt).start();
//        new Thread(ttb).start();
    }
}

class ThreadTest implements Runnable{
    //public String str;
    public ThreadLocal<String> str = new ThreadLocal<String>();
    
    @Override
    public void run() {
        for(int i = 0 ;i<10; i++){
            //System.out.println(Thread.currentThread().getName()+":"+str);
            System.out.println(Thread.currentThread().getName()+":"+str.get());
        }
    }
    
}

class Atm implements Runnable{
    //private ThreadLocal<Double> threadLocalMoneyNumber = new ThreadLocal<Double>();
    private double moneyNumber;

    @Override
    public void run() {
        try {
            showMoney();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void showMoney() throws InterruptedException {
        while(true){
            wait();
            //System.out.println(threadLocalMoneyNumber.get());
            System.out.println(moneyNumber);
        }
    }
    
    public synchronized void saveMoney(Double moneyNum){
        //threadLocalMoneyNumber.set(moneyNum);
        moneyNumber = moneyNum;
        notify();
    }
    
}
