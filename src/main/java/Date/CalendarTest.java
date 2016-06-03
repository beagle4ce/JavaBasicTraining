package Date;

import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1); // 可以控制在某一个时间轴上的加减
        System.out.println(cal.get(Calendar.YEAR)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.DATE));
    }

}
