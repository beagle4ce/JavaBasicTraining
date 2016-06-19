package extend;

public class ParentClazz {
    public ParentClazz(){
        System.out.println("\n父类被建立啦!");
    }
    
    public String parentMethod(String values){
        System.out.println("Will be return values is:\n"+values);
        new UseParentMethod().getSonMethod("这是父类调用子类的方法");
        return values;
    }
}
