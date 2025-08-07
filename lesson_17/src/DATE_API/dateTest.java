package DATE_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//SO EZ
public class dateTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String d="2004-1-24";
        Date d1=sdf.parse(d);

        SimpleDateFormat Newsdf = new SimpleDateFormat("yyyy年MM月dd日");
        String NewDate=Newsdf.format(d1);
        System.out.println(NewDate);
    }
}
