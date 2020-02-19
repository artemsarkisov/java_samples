package inspections;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyCalendar {





    public MyCalendar(Calendar date, int month) {

    }

    public static void main(String[] args) {
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        System.out.println(date);
    }

    String s = "This isn't necessary";
}
