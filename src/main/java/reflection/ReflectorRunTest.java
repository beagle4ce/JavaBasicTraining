package reflection;

public class ReflectorRunTest {

    public static void main(String[] args) throws Exception {
        BasicClass bc = ReflectorFactory.getInstance(BasicClass.class);
        bc.show();
    }

}
