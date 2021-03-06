import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateOfBirth {
    public static void main(String[] args) {
        Locale locale = new Locale("ru");
        DateFormat dateFormat = new SimpleDateFormat("YYYY  EEEE" , locale);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        Calendar dateOfBirthday = Calendar.getInstance();
        dateOfBirthday.set(1998 , 9,6);
        for (int i=0 ; dateOfBirthday.get(Calendar.YEAR) < calendar.get(Calendar.YEAR); i++ )
        {        // calendar.add(Calendar.YEAR, 1);
            dateOfBirthday.set(1998 + i, 9,6);


        System.out.println(i + " - " +  dateFormat.format(dateOfBirthday.getTime()));
    }

    }
}
