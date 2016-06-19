package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {

    public static void main(String[] args) {
        Map<Integer, String> cHashMap = new ConcurrentHashMap<Integer, String>();
        Map<Integer, String> lHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = null;
        treeMap = new TreeMap<Integer, String>();

        cHashMap.put(5, "o");
        cHashMap.put(1, "h");
        cHashMap.put(2, "e");
        cHashMap.put(4, "l");
        cHashMap.put(3, "l");
        
        lHashMap.put(5, "o");
        lHashMap.put(1, "h");
        lHashMap.put(2, "e");
        lHashMap.put(4, "l");
        lHashMap.put(3, "l");
        
        treeMap.put(5, "o");
        treeMap.put(1, "h");
        treeMap.put(2, "e");
        treeMap.put(4, "l");
        treeMap.put(3, "l");
        
        for(String str:cHashMap.values()){
            System.out.print(str);
        }// Console output is : hello
         // HashMap按照键的顺序输出
        System.out.println("\n\n");
        for(String str:lHashMap.values()){
            System.out.print(str);
        }// Console output is : ohell
         // LinkedHashMap按照压入的顺序输出
        System.out.println("\n\n");
        for(String str:treeMap.values()){
            System.out.print(str);
        }// Console output is : ohell
         // TreeMap按照键的顺序输出
    }

}
