package reflection;

public class ReflectorRunTest {

    public static void main(String[] args) throws Exception {
        BasicClass basicClass = ReflectorFactory.getInstance(BasicClass.class);
        basicClass.show();
    }

}
