package io.github.beagle4ce.javase.nowcoder;

/**
 * @author: Beagle
 * @since: 六月/15/2021 星期二
 */


public class Inertest {
    
    public static void main(String[] args) {
        EnclosingOne eo = new EnclosingOne();
        EnclosingOne.InsideOne insideOne = eo.new InsideOne();
    }
}

class EnclosingOne {
    public class InsideOne {}
}


