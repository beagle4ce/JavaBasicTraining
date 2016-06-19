package extend;

import java.util.ArrayList;
import java.util.List;

public class UseParentMethod extends ParentClazz{
    public UseParentMethod(){
        System.out.println("子类被建立啦!");
    }
    
    public String getSonMethod(String values){
        System.out.println("son method value is:\n"+values);
        return values;
    }

    public static void main(String[] args) {
        new UseParentMethod().parentMethod("子类直接可以调用父类的方法");
        List<ParentClazz> list = new ArrayList<ParentClazz>();
        list.add(new UseParentMethod());
        
        for(ParentClazz item:list){
            item.parentMethod("看看调用的谁");
        }
    }
}
