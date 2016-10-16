package exceptions;

public class TryFinallyReturn {
    public static int testMethod(){
        int number = 7;
        try{
            return number;
        }catch(Exception e){
            System.err.println(e);
        }finally {
            System.out.println("finally:"+(number++));
            //return number;
        }
        return number;
    }
    
    public static void main(String[] args) {
        System.out.println(TryFinallyReturn.testMethod());
        
        //====test ++i and i++
        int a = 2;
        int b = 6;
        int result = (a++)+(++b)+a*b;// 2+7+3*7
        System.out.println("(a++)+(++b)+a*b="+result);
    }

}
