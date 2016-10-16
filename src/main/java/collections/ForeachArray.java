package collections;

public class ForeachArray {

    public static void main(String[] args) {
        String[] strArr = {"h","e","l","l","o","!"};
        String str = "";
        str.length();
        for(String item:strArr)
            System.out.print(item);
        
        // this code just test jvm performance
        long startNum = 0;
        long oneMillion = 100000000;
        long startTime = 0;
        long endTime = 0;
        startTime = System.currentTimeMillis();
        for(long i = 1 ; i <= oneMillion ; i++){
            startNum += i;
        }
        endTime = System.currentTimeMillis();
        
        System.out.println("\nresult number is:"+startNum+"\n"+((endTime - startTime)/1000));
        // =====================================
    }

}
