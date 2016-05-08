package stringz;

public class GetSpecifclyString {

    public static void main(String[] args) {
        String str = "Own String Values";
        String[] strs = str.split(" ", 2);
        System.out.println(strs.length);
        for(int i=1;i<strs.length;i++){
            System.out.print(strs[i]+",");
        }
    }

}
