package collections;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> strList = new LinkedList<String>();
        strList.add(null);
        strList.add("a");
        strList.add("b");
        
        for(String str:strList)
            System.out.print(str+",");
        
        System.out.println("\n"+strList.get(0));
        
    }

}
